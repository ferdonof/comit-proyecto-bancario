package programabancario.entidades;

public class CuentaCorriente extends Cuenta {
	private Double descubierto = 1000.00;
	

	@Override
	public String getTipoCuenta() {
		return "Cuenta corriente";
	}
	
	@Override
	public Double getSaldo() {
		return super.getSaldo() + descubierto;
	}

	
	@Override
	public void resumenCuenta() {
		super.resumenCuenta();
		System.out.println("Saldo de la cuenta "+(getSaldo()-descubierto));
		System.out.println("*********************************************************************");
	}
}
