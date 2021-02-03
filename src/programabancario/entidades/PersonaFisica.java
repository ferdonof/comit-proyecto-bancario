package programabancario.entidades;


public class PersonaFisica extends Titular {

	public PersonaFisica(String nombre, String identificacion) {
		super(nombre, identificacion);
	}

	public String getTipoDocumento() {
		
		if (getIdentificacion() != null && !getIdentificacion().isEmpty()) {
			String[] partes = getIdentificacion().split(" ");
			return partes[0];
		}
		
		
		return "";
	}
	
	public String getNroDocumento() {
		
		if (getIdentificacion() != null && !getIdentificacion().isEmpty()) {
			String[] partes = getIdentificacion().split(" ");
			return partes[1];
		}
		
		return "";
	}
}
