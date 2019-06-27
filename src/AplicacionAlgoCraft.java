import javafx.application.Application;
import javafx.stage.Stage;
import vista.CajaMusical;
import vista.MenuVista;
import vista.RepetidorAudio;

public class AplicacionAlgoCraft extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Stage principal = primaryStage;

        MenuVista menuPrincial = new MenuVista(principal);

/*      Repe

        menu.getChildren().add(botonDeInicio);

        ventana.setScene(visualizacion);
        ventana.show();
*/
    }
}
