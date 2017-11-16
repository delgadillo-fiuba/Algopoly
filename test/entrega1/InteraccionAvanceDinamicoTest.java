package entrega1;

import org.junit.Assert;
import org.junit.Test;

import entidades.JugadorConcreto;
import juego.Dados;
import tablero.Tablero;


public class InteraccionAvanceDinamicoTest {

/***********************************************/
	
	@Test
	public void test01CaeEnAvanceDinamicoCon6EnLosDadosAvanza6Menos2() {
		
		Dados dados = Dados.getInstance();	
		JugadorConcreto jugador = new JugadorConcreto ("Jose");
		Tablero tablero = Tablero.getInstance();
		tablero.desplazar(jugador,"BS AS ZONA SUR");
		for(int i=0;dados.getValor()!=5;i++) 
			dados.lanzarDados();
		tablero.desplazar(jugador, dados.getValor());
		Assert.assertEquals(11, tablero.casillaDeJugador(jugador));
		
		/* esta en la casilla 3, sale 5 y llega ala casilla 8 "AvanceDinamico"
		 * la cualautomaticamente avalua con que valor llego ahi y 
		 * lo hace avanzar la cantidad de casilleros establecidos
		 */
	}
	
/***********************************************/
	
	@Test
	public void test02CaeEnAvanceDinamicoCon8EnLosDados() {
		
		Dados dados = Dados.getInstance();	
		JugadorConcreto jugador = new JugadorConcreto ("Jose");
		Tablero tablero = Tablero.getInstance();
		tablero.desplazar(jugador,"SALIDA");
		for(int i=0;dados.getValor()!=8;i++) 
			dados.lanzarDados();
		tablero.desplazar(jugador, dados.getValor());
		Assert.assertEquals (9,tablero.casillaDeJugador(jugador));
		
		// 100000 MOD 9 = 1
		// si saca 7,8,9,10 avanza (#dineroDelJugador % (7,8,9,10))
		
	}
	
/***********************************************/
	
	@Test
	public void test03CaeEnAvanceDinamicoCon11EnLosDados() {
		
		Dados dados = Dados.getInstance();	
		JugadorConcreto jugador = new JugadorConcreto ("Jose");
		Tablero tablero = Tablero.getInstance();
		tablero.desplazar(jugador,"TRENES");
		for(int i=0;dados.getValor()!=11;i++) 
			dados.lanzarDados();
		tablero.desplazar(jugador, dados.getValor());
		Assert.assertEquals(18, tablero.casillaDeJugador(jugador));
		
	
	}

/***********************************************/

}
