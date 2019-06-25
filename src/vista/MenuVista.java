package vista;

import controlador.ControladorDeJuego;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.Juego.Juego;

public class MenuVista {

    public MenuVista(Stage primario) {

        Group menu = new Group(PintorVista.crearBienvenida());
        Scene visualizacion = new Scene(menu);

        menu.getChildren().add(this.crearBotonComienzo(primario));

        primario.setScene(visualizacion);
        primario.show();
    }

    private Button crearBotonComienzo(Stage primario) {

        //Se crea boton para iniciar la partida
        Button botonDeComienzo = new Button("Iniciar Partida");
        botonDeComienzo.setLayoutX(800);
        botonDeComienzo.setLayoutY(450);

        botonDeComienzo.setOnAction(evento -> {
            Juego juegoModelo = new Juego();
            new JuegoVista(primario,juegoModelo);
        });

        return botonDeComienzo;
    }
}
