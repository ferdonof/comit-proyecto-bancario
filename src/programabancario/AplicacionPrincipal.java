package programabancario;

import programabancario.entidades.Banco;
import programabancario.entidades.CajaAhorro;
import programabancario.entidades.Credito;
import programabancario.entidades.Cuenta;
import programabancario.entidades.CuentaCorriente;
import programabancario.entidades.Debito;
import programabancario.entidades.Operacion;
import programabancario.entidades.PersonaFisica;
import programabancario.entidades.Titular;

public class AplicacionPrincipal {

	public static void main(String[] args) {

		Banco bancoGalicia = new Banco("Banco Rio");
		
		Cuenta cuenta1 = new CajaAhorro();
		cuenta1.setCbu(32132151);
		Titular titular = new PersonaFisica("Pablo Fernandez", "DNI 26909606");
		cuenta1.setTitular(titular);
		
		titular.agregarCuenta(cuenta1);
		
		bancoGalicia.agregarCuenta(cuenta1);
		
		Cuenta cuenta2 = new CuentaCorriente();
		bancoGalicia.agregarCuenta(cuenta2);
		cuenta2.setTitular(titular);

		titular.agregarCuenta(cuenta2);
		
		for (int i = 0; i<5; i++) {
			Cuenta cuentapos = bancoGalicia.obtenerCuentaPosicion(i);
			if (cuentapos != null)
				System.out.println("Cuenta "+i+" de tipo: "+cuentapos.getTipoCuenta());
		}
		
//		System.out.println("La "+cuenta1.getTipoCuenta()+ " tiene $"+cuenta1.getSaldo());
		Operacion credito = new Credito(2000.00);
		cuenta1.agregarOperacion(credito);
		
//		System.out.println("La "+cuenta1.getTipoCuenta()+ " tiene $"+cuenta1.getSaldo());
		
		
		cuenta1.agregarOperacion(new Debito(300.00));

		cuenta1.agregarOperacion(new Debito(1500.00));
		
		cuenta1.agregarOperacion(new Debito(300.00));
		
		cuenta1.agregarOperacion(new Debito(300.00));
		
		cuenta1.agregarOperacion(new Debito(300.00));
		
		cuenta1.agregarOperacion(new Debito(300.00));
		
		cuenta1.agregarOperacion(new Debito(300.00));
		
		cuenta1.agregarOperacion(new Debito(300.00));
		
		cuenta1.agregarOperacion(new Credito(100.00));
		
		cuenta1.agregarOperacion(new Credito(200.00));
		
		cuenta1.resumenCuenta();
		
		System.out.println();
		
		Cuenta[] cuentas = titular.getCuentas();
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null)
				System.out.println("Tipo de cuenta "+ cuentas[i].getTipoCuenta()+", CBU: "+cuentas[i].getCbu()+", Saldo $ "+cuentas[i].getSaldo());
			else 
				System.out.println("La ubicacion "+(i+1)+" es "+cuentas[i]);
		}
		
		
	}

}
