package vista;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import modelo.Juego.Juego;

public class MenuVista {

    public MenuVista(Stage primario) {

        Group menu = new Group(PintorVista.crearBienvenida());
        Scene visualizacion = new Scene(menu);

        // TODO: silenciado por problemas de compatibilidad
        // new RepetidorAudio(CajaMusical.principal);


        menu.getChildren().add(this.crearBotonComienzo(primario));

        primario.setTitle("AlgoCraft");
        primario.getIcons().add(new Image("IconoAlgoCraft.png"));
        primario.setScene(visualizacion);

        primario.show();
    }

    private Button crearBotonComienzo(Stage primario) {

        //Se crea boton para iniciar la partida
        Button botonDeComienzo = new Button("Iniciar Partida");
        botonDeComienzo.setLayoutX(450);
        botonDeComienzo.setLayoutY(550);

        botonDeComienzo.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.explosion);
            Juego juegoModelo = new Juego();
            new JuegoVista(primario,juegoModelo);
        });

        return botonDeComienzo;
    }
}
