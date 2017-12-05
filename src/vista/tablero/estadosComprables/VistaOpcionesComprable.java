package vista.tablero.estadosComprables;

import controlador.CerrarOpcionesHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VistaOpcionesComprable extends Stage {

	public VistaOpcionesComprable(Image imagen, EventHandler<ActionEvent> elEventHandler){
		
	    this.initModality(Modality.APPLICATION_MODAL);
	    VBox dialogVbox = new VBox();
	    dialogVbox.setPadding(new Insets(180, 20, 50, 20));
	    dialogVbox.setSpacing(10);

	    BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(200, 260, false, false, false, false));
	    dialogVbox.setBackground(new Background(imagenDeFondo));
	    
	    CerrarOpcionesHandler cerrarOpciones = new CerrarOpcionesHandler(((Stage)this), elEventHandler);
	    Button botonComprar = new Button("Comprar");
	    botonComprar.setOnAction(cerrarOpciones);
	    botonComprar.setMaxWidth(Double.MAX_VALUE);
	    dialogVbox.getChildren().add(botonComprar);

	    
	    Scene dialogScene = new Scene(dialogVbox, 200, 260);
	    this.setScene(dialogScene);
	    this.setResizable(false);
	}
}