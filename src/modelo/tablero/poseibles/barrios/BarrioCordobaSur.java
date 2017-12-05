package modelo.tablero.poseibles.barrios;

import modelo.entidades.Jugador;
import modelo.tablero.poseibles.barrios.construcciones.Construible;
import modelo.tablero.poseibles.barrios.construcciones.NoConstruye;

public class BarrioCordobaSur extends BarrioDoble {

	public BarrioCordobaSur(Jugador propietario) {
		super(propietario);
		this.construcciones = new NoConstruye();
	}
	

	@Override
	public void valoresDeTerreno(Construible unConstruible) {
		unConstruible.costoCosntruccion(0);
		unConstruible.precioAlquiler(1000);	
	}

	@Override
	public void valoresDeUnaCasa(Construible unConstruible) {
		unConstruible.costoCosntruccion(2000);
		unConstruible.precioAlquiler(1500);	
	}

	@Override
	public void valoresDeDosCasas(Construible unConstruible) {
		unConstruible.costoCosntruccion(2000);
		unConstruible.precioAlquiler(2500);	
	}


	@Override
	public void valoresDeHotel(Construible unConstruible) {
		unConstruible.costoCosntruccion(3000);
		unConstruible.precioAlquiler(3000);	
	}

	@Override
	public void valoresDeEdificioHistorico(Construible unConstruible) {
		// TODO Auto-generated method stub
		
	}
	
	public void interactuarCon(Barrio otroBarrio){
		otroBarrio.interactuarConCordobaSur(this);
	}
	
	public void interactuarConCordobaNorte(Barrio otroBarrio){
		this.actualizarConstrucciones(otroBarrio);
	}	
}