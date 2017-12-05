package vista.tablero.acciones;

import vista.tablero.VistaCasilla;
import modelo.tablero.Tablero;
import modelo.tablero.acciones.AvanceDinamico;

public class VistaCasillaAvanceDinamico extends VistaCasilla {

	public VistaCasillaAvanceDinamico(){
		super();
		Tablero.getInstance().cambiarCasillaPor(Tablero.CASILLA_AVANCE_DINAMICO, new AvanceDinamico());

		this.stringImagen = "file:src/vista/imagenes/CasillaAvanceDinamico.png";
        this.cambiarEstado(new EstadoAccion());
        this.dibujarCasilla();
	}
}