package programabancario.entidades;

public class Banco {
	private String nombre;
	private String sucursal;
	private String gerente;
	private Cuenta[] cuentas;
	

	public Banco(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public Banco(String nombre, String sucursal, String gerente) {
		this(nombre);
		this.sucursal = sucursal;
		this.gerente = gerente;
	}

	public Banco() {
		cuentas = new Cuenta[5];
		//	|null|null|null|null|null|
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String dameGerente() {
		return "La gerencia esta a cargo de " +gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	
	public String getGerente() {
		return gerente;
	}

	public void agregarCuenta(Cuenta cuenta) {
		int i = 0;
		boolean agregada = false;
		while((i < 5) && (agregada == false)) {
			if (cuentas[i] == null) {
				cuentas[i] = cuenta;
				agregada = true;
			}
			i = i +1;
		}
		
		if (agregada == false)
			System.out.println("No pudo agregarse la cuenta");
	}
	
	public Cuenta obtenerCuentaPosicion(int pos) {	
		if (pos < 0 || pos > cuentas.length-1) {
			System.out.println("No existe la posicion "+pos+" del vector");
			return null;
		}
		else
			return cuentas[pos];
	
	}
	
	
	public Cuenta obtenerCuentaCbu(int cbu) {	
		int i = 0;
		Cuenta cuenta = null;
		while (i < 5 &&  cuenta == null) {
			if (cbu == cuentas[i].getCbu()) 
				cuenta = cuentas[i];
			
			i++;
		}
		return cuenta;
	}

}
