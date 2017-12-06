package controlador.Comprables;

import modelo.entidades.JugadorSinSaldoException;
import modelo.juego.Turno;
import modelo.tablero.Comprable;
import modelo.tablero.Tablero;
import vista.jugador.AlertaSaldoInsuficiente;
import vista.tablero.VistaTablero;
import vista.tablero.estadosPoseibles.TrenEstadoPoseible;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TrenComprableHandler implements EventHandler<ActionEvent> {

	Comprable unComprable;
	
	public TrenComprableHandler(Comprable unComprable){
		this.unComprable = unComprable;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
    	try{
        	this.unComprable.comprar(Turno.getInstance().turnoActual());
        	VistaTablero.getInstance().obtenerCasilla(Tablero.CASILLA_TREN).cambiarEstado(new TrenEstadoPoseible());
    	}catch(JugadorSinSaldoException e){
    		new AlertaSaldoInsuficiente();
    	}
	}
}
