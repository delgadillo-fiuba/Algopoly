package comprables;

import poseibles.Aysa;
import entidades.Banco;
import entidades.Jugador;
import tablero.*;

public class AysaComprable implements Comprable{

	private int precioCompra;
	
	public void afectar(Jugador jugador) {
	}

	public int precioDeCompra() {
		return this.precioCompra;
	}

	public void comprar(Jugador unJugador) {
		unJugador.pagarA(Banco.getInstance(), precioCompra);
		Aysa aysa = new Aysa(unJugador);
		unJugador.agregarCompania(aysa);
		Tablero.getInstance().cambiarCasillaPor(Tablero.CASILLA_AYSA, aysa);
	}
}