package entrega1;

import org.junit.Assert;
import org.junit.Test;

import entidades.JugadorConcreto;
import juego.Dados;
import tablero.Casilla;
import tablero.Tablero;
import acciones.AvanceDinamico;
import acciones.RetrocesoDinamico;
import propiedades.Terreno;

public class InteraccionRetrocesoDinamicoTest {
	
/***********************************************/
	
	@Test
	public void test01CaeEnRetrocesoDinamicoCon2EnLosDadosYTiene1Propiedades() {
		
		Dados dados = Dados.getInstance();	
		JugadorConcreto jugador = new JugadorConcreto ("Jose");
		Tablero tablero = Tablero.getInstance();
		tablero.desplazar(jugador,"TRENES");
		for(int i=0;dados.getValor()!=2;i++) 
			dados.lanzarDados();
		tablero.desplazar(jugador, dados.getValor());
		Assert.assertEquals(18,tablero.casillaDeJugador(jugador));
	}
	
/***********************************************/	
	
	@Test
	public void test02CaeEnRetrocesoDinamicoCon6EnLosDadosYTiene1Propiedades() {
		
		Dados dados = Dados.getInstance();	
		JugadorConcreto jugador = new JugadorConcreto ("Jose");
		Tablero tablero = Tablero.getInstance();
		tablero.desplazar(jugador,"SANTA FE");
		System.out.println("Dinero:"+ jugador.capital());
		for(int i=0;dados.getValor()!=7;i++) 
			dados.lanzarDados();
		tablero.desplazar(jugador, dados.getValor());
		Assert.assertEquals(13, tablero.casillaDeJugador(jugador));
	}
	
/***********************************************/	
	
	@Test
	public void test03CaeEnRetrocesoDinamicoCon12EnLosDadosAvanza12Menos2() {
		
		Dados dados = Dados.getInstance();	
		JugadorConcreto jugador = new JugadorConcreto ("Jose");
		Tablero tablero = Tablero.getInstance();
		tablero.desplazar(jugador,"CORDOBA SUR");
		for(int i=0;dados.getValor()!=12;i++) 
			dados.lanzarDados();
		tablero.desplazar(jugador, dados.getValor());
		Assert.assertEquals (9,tablero.casillaDeJugador(jugador));

	}	
	
}
