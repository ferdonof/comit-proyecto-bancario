package programabancario.entidades;

public class Debito extends Operacion {

	public Debito(Double monto) {
		super(monto);
	}
	
	@Override
	public Double getMonto() {
		return super.getMonto() * -1;

	}

}
