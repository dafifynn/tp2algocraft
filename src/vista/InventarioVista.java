package vista;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.Constantes;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Inventario;

import java.util.Observable;
import java.util.Observer;

public class InventarioVista implements Observer {

    private Scene vista;
    private Group elementos;
    private PlantillaVista plantillaVista;

    public InventarioVista(Inventario modelo) {

        this.elementos = crearBotones(modelo);
        this.vista = new Scene(elementos,480,480);
    }

    @Override
    public void update(Observable observable, Object arg) {

        if(observable instanceof Inventario) {
            Inventario actualizado = (Inventario) observable;
            this.elementos.getChildren().removeAll(this.elementos.getChildren());
            this.elementos.getChildren().addAll(crearBotones(actualizado));
            //TODO: optimizar
        }
    }

    public Scene visualizacion() {
        return this.vista;
    }

    public Group elementos() {
        return this.elementos;
    }

    private Group crearBotones(Inventario modelo) {

        Image casilla = new Image("slot2.png");
        Image hachaMadera = new Image("HachaMadera.png");
        Image hachaPiedra = new Image("HachaPiedra.png");
        Image hachaMetal = new Image("HachaMetal.png");
        Image picoMadera = new Image("PicoMadera.png");
        Image picoPiedra = new Image("PicoPiedra.png");
        Image picoMetal = new Image("PicoMetal.png");
        Image picoFino = new Image("PicoFino.png");

        Group botones = new Group();

        int filasHerramientas = Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_HERRAMIENTAS / 9;

        //TODO: Group botonesDePlantilla = plantillaVista.crearBotones();

        for(int i = 0; i < filasHerramientas; i++) {

            for(int j = 0; j < 9 ; j ++) {

                Button boton = new Button();
                boton.setLayoutX(24 + (j * 48));
                boton.setLayoutY( 240 + (i * 48));

                int indice = 0;
                indice = (i * 9) + j;
                Herramienta obtenida = modelo.obtenerHerramienta(indice);

                if(obtenida == null) {
                    boton.setGraphic(new ImageView(casilla));
                }
                else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_MADERA) {
                    boton.setGraphic(new ImageView(hachaMadera));
                }
                else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_PIEDRA) {
                    boton.setGraphic(new ImageView(hachaPiedra));
                }
                else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_METAL) {
                    boton.setGraphic(new ImageView(hachaMetal));
                }
                else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_MADERA) {
                    boton.setGraphic(new ImageView(picoMadera));
                }
                else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_PIEDRA) {
                    boton.setGraphic(new ImageView(picoPiedra));
                }
                else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_METAL) {
                    boton.setGraphic(new ImageView(picoMetal));
                }
                else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_FINO) {
                    boton.setGraphic(new ImageView(picoFino));
                }
                boton.setOnAction(event -> {});
                botones.getChildren().add(boton);
            }
        }

        //boton madera
        Button botonMadera = new Button();
        botonMadera.setLayoutX(24);
        botonMadera.setLayoutY(400);
        botonMadera.setGraphic(new ImageView(new Image("BloqueMadera.png")));
        botonMadera.setOnAction(evento -> modelo.seleccionarMadera());

        botones.getChildren().add(botonMadera);

        //boton piedra
        Button botonPiedra = new Button();
        botonPiedra.setLayoutX(72);
        botonPiedra.setLayoutY(400);
        botonPiedra.setGraphic(new ImageView(new Image("BloquePiedra.png")));
        botonPiedra.setOnAction(evento -> modelo.seleccionarPiedra());

        botones.getChildren().add(botonPiedra);

        //boton metal
        Button botonMetal = new Button();
        botonMetal.setLayoutX(120);
        botonMetal.setLayoutY(400);
        botonMetal.setGraphic(new ImageView(new Image("BloqueMetal.png")));
        botonMetal.setOnAction(evento -> modelo.seleccionarDiamante());

        botones.getChildren().add(botonMetal);

        //boton diamante
        Button botonDiamante = new Button();
        botonDiamante.setLayoutX(168);
        botonDiamante.setLayoutY(400);
        botonDiamante.setGraphic(new ImageView(new Image("BloqueDiamante.png")));
        botonDiamante.setOnAction(evento -> modelo.seleccionarDiamante());

        botones.getChildren().add(botonDiamante);

        //plantilla
        Button grilla11 = new Button();
        grilla11.setLayoutX(312);
        grilla11.setLayoutY(48);
        grilla11.setGraphic(new ImageView(new Image("slot2.png")));
        grilla11.setOnAction(evento -> modelo.guardarSeleccionadoEnGrilla(0,0));

        botones.getChildren().add(grilla11);

        Button grilla12 = new Button();
        grilla12.setLayoutX(360);
        grilla12.setLayoutY(48);
        grilla12.setGraphic(new ImageView(new Image("slot2.png")));
        grilla12.setOnAction(evento -> modelo.guardarSeleccionadoEnGrilla(0,1));

        botones.getChildren().add(grilla12);

        Button grilla13 = new Button();
        grilla13.setLayoutX(408);
        grilla13.setLayoutY(48);
        grilla13.setGraphic(new ImageView(new Image("slot2.png")));
        grilla13.setOnAction(evento -> modelo.guardarSeleccionadoEnGrilla(0,2));

        botones.getChildren().add(grilla13);

        Button grilla21 = new Button();
        grilla21.setLayoutX(312);
        grilla21.setLayoutY(96);
        grilla21.setGraphic(new ImageView(new Image("slot2.png")));
        grilla21.setOnAction(evento -> modelo.guardarSeleccionadoEnGrilla(1,0));

        botones.getChildren().add(grilla21);

        Button grilla22 = new Button();
        grilla22.setLayoutX(360);
        grilla22.setLayoutY(96);
        grilla22.setGraphic(new ImageView(new Image("slot2.png")));
        grilla22.setOnAction(evento -> modelo.guardarSeleccionadoEnGrilla(1,1));

        botones.getChildren().add(grilla22);

        Button grilla23 = new Button();
        grilla23.setLayoutX(408);
        grilla23.setLayoutY(96);
        grilla23.setGraphic(new ImageView(new Image("slot2.png")));
        grilla23.setOnAction(evento -> modelo.guardarSeleccionadoEnGrilla(1,2));

        botones.getChildren().add(grilla23);

        Button grilla31 = new Button();
        grilla31.setLayoutX(312);
        grilla31.setLayoutY(144);
        grilla31.setGraphic(new ImageView(new Image("slot2.png")));
        grilla31.setOnAction(evento -> modelo.guardarSeleccionadoEnGrilla(2,0));

        botones.getChildren().add(grilla31);

        Button grilla32 = new Button();
        grilla32.setLayoutX(360);
        grilla32.setLayoutY(144);
        grilla32.setGraphic(new ImageView(new Image("slot2.png")));
        grilla32.setOnAction(evento -> modelo.guardarSeleccionadoEnGrilla(2,1));

        botones.getChildren().add(grilla32);

        Button grilla33 = new Button();
        grilla33.setLayoutX(408);
        grilla33.setLayoutY(144);
        grilla33.setGraphic(new ImageView(new Image("slot2.png")));
        grilla33.setOnAction(evento -> modelo.guardarSeleccionadoEnGrilla(2,2));

        botones.getChildren().add(grilla33);

        Button contruir = new Button("Construir");
        contruir.setLayoutX(240);
        contruir.setLayoutY(48);
        contruir.setOnAction(evento -> modelo.contruirHerramientaDeGrilla());

        botones.getChildren().add(contruir);

        return botones;
    }

    public void observar(Observable observable) {

        if(observable instanceof Inventario) {
            Inventario modelo = (Inventario) observable;
            modelo.agregarObservador(this);
        }
    }
}

