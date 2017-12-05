package controlador.Comprables;

import modelo.juego.Turno;
import modelo.tablero.Comprable;
import modelo.tablero.Tablero;
import vista.tablero.VistaTablero;
import vista.tablero.estadosPoseibles.TrenEstadoPoseible;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TrenComprableHandler implements EventHandler<ActionEvent> {

	Comprable unComprable;
	
	public TrenComprableHandler(Comprable unComprable){
		this.unComprable = unComprable;
	}
	
	
    public void handle(ActionEvent actionEvent) {
    	this.unComprable.comprar(Turno.getInstance().turnoActual());
    	VistaTablero.getInstance().obtenerCasilla(Tablero.CASILLA_TREN).cambiarEstado(new TrenEstadoPoseible());
    }
}