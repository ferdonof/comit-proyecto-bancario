package programabancario.entidades;

public abstract class Cuenta {
	private int cbu;
	private int nro;
	private String estado = "Abierta";
	private Operacion[] operaciones = new Operacion[15];
	private Titular titular;
		
	
	
	public void setCbu(int cbu) {
		this.cbu = cbu;
	}
	
	public int getCbu() {
		return cbu;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	protected String errorSaldo() {
		return "Error: Monto insuficiente para esta operacion ($ "+ getSaldo()+").";
	}

	
	public Double getSaldo() {
		Double saldo = 0.0;
		
		for (int i = 0; i < operaciones.length; i++) {
			if (operaciones[i] != null && operaciones[i].getAceptada() == true)
				saldo = saldo + operaciones[i].getMonto();
		}
		
		
		return saldo;
		
	};
	
	public void agregarOperacion(Operacion op) {
		int i = 0;
		boolean agregada = false;
		
		op.setAceptada(((getSaldo() + op.getMonto()) >= 0));
		while (i < operaciones.length && !agregada) {
			if (operaciones[i] == null) {
				operaciones[i] = op;
				agregada = true;
			}
			
			i++;
		}
		
		
		// agregada == false
		if (!agregada)
			System.out.println("La operacion no pudo ser agregada");
	}
	
	public abstract String getTipoCuenta();
	
	
	public void resumenCuenta() {
		System.out.println("\n************************ Resumen de cuenta **************************");
		System.out.println("Titular de cuenta: "+ this.getTitular());
		System.out.println(this.getTipoCuenta()+" CBU "+this.getCbu());
		for (int i = 0; i < operaciones.length; i++) {
			if (operaciones[i] != null) {
				if (operaciones[i].getAceptada()) 
					System.out.println("Operacion del dia "+operaciones[i].getFecha()+": $ "+operaciones[i].getMonto());
				else 
					System.out.println("Operacion del dia "+operaciones[i].getFecha()+": $ "+operaciones[i].getMonto()+ "(Rechazada)");
					
				}
			}
		System.out.println("\n*********************************************************************");
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}
		
}
