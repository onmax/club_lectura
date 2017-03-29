
public class Lector {
	private int nSocio;
	private String nombre;
	private Libro [] historicoLectura = new Libro[10];
	private int capacidad = 0;
	

	
	public Lector(int nSocio, String nombre){
		this.nSocio = nSocio;
		this.nombre = nombre;
	}
	
	public int getnSocio(){
		return this.nSocio;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void leerLibro(Libro lib) {
		boolean ins = false;
		for(int i =0;i<historicoLectura.length; i++){
			if(!ins && historicoLectura[i]!= null){
				historicoLectura[i] = lib;			
				ins = true;
			}
		}
		if(!ins){
			for(int j = 0; j<historicoLectura.length - 1;j++){
				historicoLectura[j] = historicoLectura[j+1];
			}
			historicoLectura[historicoLectura.length - 1] = lib;
		}
		
		for(int i =0; i<historicoLectura.length; i++){
			if(historicoLectura[i] != null){
				System.out.println(i + "   " + historicoLectura[i]);
			}
		}
		
	}
	
	public String listarHistorico() {
		String aux = "";
		for (int i = 0; i < this.historicoLectura.length - 1; i++) {
			if (this.historicoLectura[i] != null) {
				aux += this.historicoLectura[i].getTitulo() + ", ";
			}
		}
		//System.out.println(aux.substring(0, aux.length() - 2));
		return aux;
	}
	
	public boolean esIgual(Lector lector) {
		boolean bool = true;
		if (this.nSocio == lector.nSocio) {
			int cont = 0;
			while(bool && cont < this.historicoLectura.length){
				if(this.historicoLectura[cont] != lector.historicoLectura[cont]){
					bool = false;
				}
				cont++;
			}
		}
		return bool;
	}
	

	

}
