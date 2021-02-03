package programabancario.entidades;

public abstract class Titular {
	private String nombre;
	private String identificacion;
	private Cuenta[] listaCuentas = new Cuenta[8];
	
	
	public Titular(String nombre, String identificacion) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		int i = 0;
		boolean agregada = false;
		while( i < listaCuentas.length && !agregada ) {
				if (listaCuentas[i] == null) {
					listaCuentas[i] = cuenta;
					agregada = true;
				}
				i++;
		}
		
		if (!agregada)
			System.out.println("La cuenta no pudo ser agregada");
	}

	@Override
	public String toString() {
		return nombre+" - "+identificacion;
	}


	public Cuenta[] getCuentas() {
		return this.listaCuentas;
	}
	
}
