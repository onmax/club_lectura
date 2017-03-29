import fecha.Fecha;

public class Libro {
	private String titulo, autor;
	private Fecha fechaPublicacion;
	private int nVecesPrestado;
	
	public Libro(String titulo, String autor, Fecha fechaPublicacion){
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
	}
	
	public String getAutor(){
		return this.autor;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public void prestado(){
		nVecesPrestado ++;
	}
	
	public int getnVecesPrestado(){
		return this.nVecesPrestado;
	}
	
	public Fecha getFechaPublicacion(){
		return this.fechaPublicacion;
	}
	
	public boolean esIgual(Libro libro){
		if(this.autor == libro.getAutor() && this.titulo == libro.getTitulo() && this.fechaPublicacion.equals(libro.getFechaPublicacion())){
			return true;
		}else{
			return false;
		}
	}
}
