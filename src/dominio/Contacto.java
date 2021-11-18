package dominio;

public class Contacto{

	private String nombre;
	private String numeroDeTelefono;
	
	public Contacto(String nombre, String numeroDeTelefono){
		this.nombre = nombre;
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public String getNombre(){return nombre;}
	public String getNumeroDeTelefono(){return numeroDeTelefono;}
	public void setNombre(String nombre){this. nombre = nombre;}
	public void setNumeroDeTelefono(String numeroDeTelefono){this.numeroDeTelefono = numeroDeTelefono;}

    
}
