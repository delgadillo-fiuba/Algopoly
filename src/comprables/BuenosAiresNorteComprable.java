package comprables;

import barrios.BarrioBuenosAiresNorte;
import entidades.Banco;
import entidades.Jugador;
import tablero.Comprable;
import tablero.Tablero;

public class BuenosAiresNorteComprable implements Comprable {

	private int precioCompra;

	public void afectar(Jugador jugador) {
	}

	public int precioDeCompra() {
		return this.precioCompra;
	}

	public void comprar(Jugador unJugador) {
		unJugador.pagarA(Banco.getInstance(), precioCompra);
		BarrioBuenosAiresNorte bueNor= new BarrioBuenosAiresNorte(unJugador);
		unJugador.agregarBarrio(bueNor);
		Tablero.getInstance().cambiarCasillaPor(Tablero.CASILLA_BUENOS_AIRES_NORTE, bueNor);
	}
}
