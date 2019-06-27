package vista;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import modelo.Constantes;
import modelo.Excepciones.MaterialInexistenteException;
import modelo.Jugador.Inventario;
import modelo.Jugador.Jugador;
import modelo.Mapa.Coordenada;
import modelo.Mapa.Mapa;
import modelo.Material.*;

public class PintorVista {

    public static Canvas crearBienvenida() {

        Canvas bienvenida = new Canvas(1000,600);

        GraphicsContext contenidoBienvenida = bienvenida.getGraphicsContext2D();

        Image menu = new Image("menu.png");
        contenidoBienvenida.drawImage(menu,0,0);

        contenidoBienvenida.setFill(Color.WHITE);
        contenidoBienvenida.setStroke(Color.BLACK);
        contenidoBienvenida.setLineWidth(2);
        contenidoBienvenida.setFont(Font.font("Verdana", FontWeight.BOLD, 100));
        contenidoBienvenida.fillText("ALGOCRAFT", 150,130);
        contenidoBienvenida.strokeText("ALGOCRAFT",150,130);

        contenidoBienvenida.setFill(Color.WHITE);
        contenidoBienvenida.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        contenidoBienvenida.fillText("Aprobaremos...?", 850,580);

        return bienvenida;
    }

}
