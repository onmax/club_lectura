import fecha.Fecha;
import fecha.excepciones.FechaIncorrecta;

/**
 * 
 */

/**
 * @author agonzalez
 *
 */
public class TestLectorAlum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Las siguiente l�neas van encaminadas a comprobar que se han definido
		//las cabeceras de los m�todos correctamente. 
		//Si el c�digo no compila es que est�n mal definida alguna cabecera
		//Si compila se ejecuta este main, si una prueba da KO no se puede asegurar que
		//el resto de pruebas den un resultado fiable. Se deber�a corregir el error y
		//volver a probar
		try {
			Libro libro1 = new Libro("El quijote", 
					"Miguel de Cervantes", new Fecha("16/01/1605"));
			Libro libro2 = new Libro("El quijote 2� edici�n", 
					"Miguel de Cervantes", new Fecha("16/01/1625"));
			Lector lector = new Lector(300,"Pepe White");
			Lector lector2 = new Lector(300,"Pepe Black");
			
			if (lector.getNombre().equals("Pepe White")){
				System.out.println("getNombre OK");
			}
			else
			{
				System.err.println("getNombre KO, no retorna el nombre correcto.\n"
						+"Revise el constructor y getNombre");
			}
			
			if (lector.getnSocio()==300){
				System.out.println("getnSocio OK");
			}
			else
			{
				System.err.println("getnSocio KO, no retorna el n�mero de socio correcto.\n"
						+"Revise el constructor y getnSocio");
			}
			
			//Se comprueba la igualdad. Dos lectores. Dos lectores son iguales
			//si y s�lo si cuando coincide el n�mero de socio y los libros le�dos que hay en el
			//hist�rico son los mismos y est�n en el mismo orden
			
			if (lector.esIgual(lector2)){
				System.out.println("esIgual OK");
			}
			else
			{
				System.err.println("1esIgual KO, no retorna valor correcto.\n"
						+"Revise el m�todo esIgual y el m�todo leerLibro");
			}			
			
			lector.leerLibro(libro2);
			lector.leerLibro(libro1);
			lector2.leerLibro(libro2);
			//Son lectores distintos por que han leido disintos libros
			if (!lector.esIgual(lector2)){
				System.out.println("esIgual OK");
			}
			else
			{
				System.err.println("2esIgual KO, no retorna valor correcto.\n"
						+"Revise el m�todo esIgual y el m�todo leerLibro");
			}
			
		
			//Se va a comprobar la cadena retornada por hist�rico, se quitan los espacios en blanco 
			//y saltos de l�nea
			
			if (lector.listarHistorico().replaceAll("\\s","").equals("Elquijote2�edici�n,Elquijote")){
				System.out.println("listarHistorico OK");
			}
			else
			{
				System.err.println("listarHistorico KO, no retorna valor correcto.\n"
						+"Revise el m�todo leerLibro y el m�todo listarHistorico");
			}
			
		} catch (FechaIncorrecta e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
