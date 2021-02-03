package programabancario.entidades;

public class CajaAhorro extends Cuenta {


	@Override
	public String getTipoCuenta() {
		return "Caja de Ahorro";
	}

	@Override
	public void resumenCuenta() {
		super.resumenCuenta();
		System.out.println("Saldo de la cuenta $ "+this.getSaldo());
		System.out.println("\n*********************************************************************");

	}

}
