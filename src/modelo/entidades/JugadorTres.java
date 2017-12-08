package modelo.entidades;

public class JugadorTres extends Jugador {

	public JugadorTres(String unNombre) {
		super(unNombre);
	}

	@Override
	public void pagarA(Jugador cobrador, int monto) {
		cobrador.cobrarAJugador(this, monto);
	}

	@Override
	protected int cobrarAJugador(JugadorUno pagador, int monto) {
		this.capital += pagador.pagar(monto);
		
		return monto;
	}

	@Override
	protected int cobrarAJugador(JugadorDos pagador, int monto) {
		this.capital += pagador.pagar(monto);
		
		return monto;
	}

	@Override
	protected int cobrarAJugador(JugadorTres pagador, int monto) {
		return 0;
	}

	@Override
	protected int cobrarABanco(Banco pagador, int monto) {
		this.capital += pagador.pagar(monto);
		
		return monto;
	}

}
