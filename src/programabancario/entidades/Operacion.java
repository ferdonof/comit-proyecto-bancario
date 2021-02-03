package programabancario.entidades;

import java.util.Date;

public class Operacion {

	private Double monto;
	private Date fecha;
	private boolean aceptada = false;
	
	public Operacion(Double monto) {
		this.monto = monto;
		this.fecha = new Date();
	}
	
	public Double getMonto() {
		return monto;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setAceptada(boolean aceptada) {
		this.aceptada = aceptada;
	}
	
	public boolean getAceptada() {
		return this.aceptada;
	}
}
