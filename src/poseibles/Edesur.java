package poseibles;

import tablero.*;
import entidades.Jugador;
import juego.Dados;

public class Edesur implements Compania {

	private Jugador propietario;
	
	public Edesur(Jugador propietario){
		this.propietario = propietario;
	}

	protected int cobrar() {
		int dados = Dados.getInstance().getValor();
		int veces = 500;
		
		for(Compania compania : this.propietario.obtenerCompanias()){
			veces += this.cobrarCon(compania);
		}
		
		return (dados * veces);
	}

	public Jugador propietario() {
		return this.propietario;
	}

	public void afectar(Jugador jugador) {
		this.propietario.cobrar(jugador.pagar(this.cobrar()));
	}

	public int cobrarCon(Compania otraCompania) {
		return otraCompania.cobrarConEdesur();
	}

	public int cobrarConAysa() {
		return 500;
	}

	public int cobrarConEdesur() {
		return 0;
	}

	public int cobrarConTren() {
		return 0;
	}

	public int cobrarConSubte() {
		return 0;
	}
}
