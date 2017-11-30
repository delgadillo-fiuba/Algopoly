package modelo.tablero.casillas.poseibles.barrios;

import java.util.List;

import modelo.tablero.casillas.poseibles.*;


public abstract class ConstruccionPosible {

	List<Construible> construcciones;
	
	public Construccion construir(Barrio unBarrio) throws NadaParaConstruirException{
		Construccion construccion = null;
		try{
			Construible aConstruir = this.construcciones.get(0);
			construccion = aConstruir.construirEn(unBarrio);
			this.construcciones.remove(0);
		}catch(NullPointerException e){
			throw new NadaParaConstruirException();
		}
		
		return construccion;
	}
	
	
	public int costoConstruccion(Barrio unBarrio) throws NadaParaConstruirException{
		try{
			Construible aConstruir = this.construcciones.get(0);
			return (aConstruir.costoConstruccionEn(unBarrio));
		}catch(NullPointerException e){
			throw new NadaParaConstruirException();
		}
	}


	public abstract ConstruccionPosible actualizarCon(ConstruccionPosible otraConstruccionPosible);
	public abstract ConstruccionPosible actualizarConNoConstruye(ConstruccionPosible otraConstruccionPosible);
	public abstract ConstruccionPosible actualizarConSoloCasa(ConstruccionPosible otraConstruccionPosible);
	public abstract ConstruccionPosible actualizarConHastaDosCasas(ConstruccionPosible otraConstruccionPosible);
	public abstract ConstruccionPosible actualizarConHastaHotel(ConstruccionPosible otraConstruccionPosible);
	public abstract ConstruccionPosible actualizarConSoloEdificioHistorico(ConstruccionPosible otraConstruccionPosible);

}