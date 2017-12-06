package modelo.tablero.poseibles.barrios;

import modelo.entidades.Banco;
import modelo.entidades.Jugador;
import modelo.tablero.Tablero;
import modelo.tablero.comprables.SaltaSurComprable;
import modelo.tablero.poseibles.barrios.construcciones.Construible;
import modelo.tablero.poseibles.barrios.construcciones.NoConstruye;

public class BarrioSaltaSur extends BarrioDoble {

	public BarrioSaltaSur(Jugador propietario) {
		super(propietario);
		this.construcciones = new NoConstruye();
	}
	

	@Override
	public void valoresDeTerreno(Construible unConstruible) {
		unConstruible.costoCosntruccion(0);
		unConstruible.precioAlquiler(2000);	
	}

	@Override
	public void valoresDeUnaCasa(Construible unConstruible) {
		unConstruible.costoCosntruccion(4500);
		unConstruible.precioAlquiler(3250);	
	}

	@Override
	public void valoresDeDosCasas(Construible unConstruible) {
		unConstruible.costoCosntruccion(4500);
		unConstruible.precioAlquiler(3850);	
	}


	@Override
	public void valoresDeHotel(Construible unConstruible) {
		unConstruible.costoCosntruccion(7500);
		unConstruible.precioAlquiler(5500);	
	}

	@Override
	public void valoresDeEdificioHistorico(Construible unConstruible) {
		// TODO Auto-generated method stub
		
	}
	
	public void interactuarCon(Barrio otroBarrio){
		otroBarrio.interactuarConSaltaSur(this);
	}
	
	public void interactuarConSaltaNorte(Barrio otroBarrio){
		this.actualizarConstrucciones(otroBarrio);
	}
	
	@Override
	public void vender() {
		SaltaSurComprable barrio = new SaltaSurComprable();
		while(this.construido.sePuedeVender()){
			this.construido = this.construido.vender();
		}
		this.propietario.quitarBarrio(this);
		Banco.getInstance().pagarA(this.propietario, (int) (barrio.precioDeCompra() * 0.85));
		Tablero.getInstance().cambiarCasillaPor(Tablero.CASILLA_SALTA_SUR, barrio);
		this.chequearComplemento();
	}

}
