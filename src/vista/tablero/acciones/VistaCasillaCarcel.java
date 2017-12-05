package vista.tablero.acciones;

import modelo.tablero.Tablero;
import modelo.tablero.acciones.Carcel;
import vista.tablero.VistaCasilla;

public class VistaCasillaCarcel extends VistaCasilla {
	
	public VistaCasillaCarcel(){
		super();
		Tablero.getInstance().cambiarCasillaPor(Tablero.CASILLA_CARCEL, new Carcel());

		this.stringImagen = "file:src/vista/imagenes/CasillaCarcel.png";
		this.dibujarFondo();
        this.cambiarEstado(new EstadoCarcel());
        this.dibujarCasilla();
	}
}
