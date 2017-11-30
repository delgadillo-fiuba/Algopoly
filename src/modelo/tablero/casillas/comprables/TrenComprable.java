package modelo.tablero.casillas.comprables;

import modelo.entidades.*;
import modelo.tablero.*;
import modelo.tablero.casillas.poseibles.Tren;

public class TrenComprable implements Comprable {

	private int precioCompra;

	public void afectar(Jugador jugador) {
	}

	public int precioDeCompra() {
		return this.precioCompra;
	}

	public void comprar(Jugador unJugador) {
		unJugador.pagarA(Banco.getInstance(), precioCompra);
		Tren tren = new Tren(unJugador);
		unJugador.agregarCompania(tren);
		Tablero.getInstance().cambiarCasillaPor(Tablero.CASILLA_TREN, tren);
	}
}