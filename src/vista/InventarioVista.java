package vista;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.Constantes;
import modelo.Herramienta.Hacha;
import modelo.Herramienta.Herramienta;
import modelo.Herramienta.Pico;
import modelo.Herramienta.PicoFino;
import modelo.Jugador.Inventario;
import modelo.Jugador.Jugador;
import modelo.Material.MaterialMadera;
import modelo.Material.MaterialMetal;
import modelo.Material.MaterialPiedra;

import java.util.Observable;
import java.util.Observer;

public class InventarioVista implements Observer {

    private Scene vista;
    private Group elementos;
    //private PlantillaVista plantillaVista;

    private Button botonLabelMadera;
    private Button botonLabelPiedra;
    private Button botonLabelMetal;
    private Button botonLabelDiamante;

    private Jugador modeloJugador;


    public InventarioVista(Inventario modeloInventario, Jugador modeloJugador) {

        this.modeloJugador = modeloJugador;

        this.elementos = crearBotones(modeloInventario, modeloJugador);
        this.inicializarBotonesDeMaterial(modeloJugador.obtenerInventario());
        this.inicializarBotonesDeCantidadDeMateriales();
        this.actualizarCantidadDeBotonesLabel(modeloJugador.obtenerInventario());
        this.vista = new Scene(elementos,480,480);

    }

    @Override
    public void update(Observable observable, Object arg) {

        if(observable instanceof Inventario) {
            Inventario actualizado = (Inventario) observable;
            this.elementos.getChildren().removeAll(this.elementos.getChildren());
            this.elementos.getChildren().addAll(crearBotones(actualizado, modeloJugador));

        }
            //TODO: optimizar

    }

    public Scene visualizacion() {
        return this.vista;
    }

    public Group elementos() {
        return this.elementos;
    }

    private void inicializarBotonesDeMaterial (Inventario modelo) {
        //boton madera
        Button botonMadera = new Button();
        botonMadera.setLayoutX(266);
        botonMadera.setLayoutY(240);
        botonMadera.setGraphic(new ImageView(new Image("bloqueMaterial/BloqueMadera.png")));
        botonMadera.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            modelo.seleccionarMadera();
        });

        this.elementos.getChildren().add(botonMadera);

        //boton piedra
        Button botonPiedra = new Button();
        botonPiedra.setLayoutX(314);
        botonPiedra.setLayoutY(240);
        botonPiedra.setGraphic(new ImageView(new Image("bloqueMaterial/BloquePiedra.png")));
        botonPiedra.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            modelo.seleccionarPiedra();
        });

        this.elementos.getChildren().add(botonPiedra);

        //boton metal
        Button botonMetal = new Button();
        botonMetal.setLayoutX(362);
        botonMetal.setLayoutY(240);
        botonMetal.setGraphic(new ImageView(new Image("bloqueMaterial/BloqueMetal.png")));
        botonMetal.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            modelo.seleccionarMetal();
        });

        this.elementos.getChildren().add(botonMetal);

        //boton diamante
        Button botonDiamante = new Button();
        botonDiamante.setLayoutX(410);
        botonDiamante.setLayoutY(240);
        botonDiamante.setGraphic(new ImageView(new Image("bloqueMaterial/BloqueDiamante.png")));
        botonDiamante.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            modelo.seleccionarDiamante();
        });

        this.elementos.getChildren().add(botonDiamante);
    }


    private void inicializarBotonesDeCantidadDeMateriales () {
        //label del boton madera
        botonLabelMadera = new Button();
        botonLabelMadera.setLayoutX(266);
        botonLabelMadera.setLayoutY(210);

        this.elementos.getChildren().add(botonLabelMadera);

        //label del boton piedra
        botonLabelPiedra = new Button();
        botonLabelPiedra.setLayoutX(314);
        botonLabelPiedra.setLayoutY(210);

        this.elementos.getChildren().add(botonLabelPiedra);


        //label del boton metal
        botonLabelMetal = new Button();
        botonLabelMetal.setLayoutX(362);
        botonLabelMetal.setLayoutY(210);

        this.elementos.getChildren().add(botonLabelMetal);

        //label del boton diamante
        botonLabelDiamante = new Button();
        botonLabelDiamante.setLayoutX(410);
        botonLabelDiamante.setLayoutY(210);

        this.elementos.getChildren().add(botonLabelDiamante);

    }

    private void actualizarCantidadDeBotonesLabel(Inventario modelo) {
        botonLabelMadera.setText(Integer.toString(modelo.cantidadDeMadera()));
        botonLabelPiedra.setText(Integer.toString(modelo.cantidadDePiedra()));
        botonLabelMetal.setText(Integer.toString(modelo.cantidadDeMetal()));
        botonLabelDiamante.setText(Integer.toString(modelo.cantidadDeDiamante()));

    }

    private Group crearBotones(Inventario modelo, Jugador modeloJugador) {

        Group botones = new Group();



        //TODO: Group botonesDePlantilla = plantillaVista.crearBotones();

        //boton herramienta actual
        Button botonHerramientaEquipada = new Button();
        botonHerramientaEquipada.setLayoutY(24);
        botonHerramientaEquipada.setLayoutX(24);
        ponerImagenHerramienta(botonHerramientaEquipada, modeloJugador);

        botones.getChildren().add(botonHerramientaEquipada);

        for(int i = 0; i < Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_HERRAMIENTAS ; i++) {

            Button boton = new Button();
            boton.setLayoutX(24 + (i * 48));
            boton.setLayoutY(400);

            int indice = i;
            Herramienta obtenida = modelo.obtenerHerramienta(indice);
            if(obtenida == null) {
                boton.setGraphic(new ImageView("slot2.png"));
            }
            else if((obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_MADERA) && (obtenida.getClass().isAssignableFrom(Hacha.class))){
                boton.setGraphic(new ImageView(Constantes.URL_HERRAMIENTA + "hachaMadera.png"));
            }
            else if((obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_PIEDRA) && (obtenida.getClass().isAssignableFrom(Hacha.class))) {
                boton.setGraphic(new ImageView(new Image(Constantes.URL_HERRAMIENTA + "HachaPiedra.png")));
            }
            else if((obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_METAL) && (obtenida.getClass().isAssignableFrom(Hacha.class))) {
                boton.setGraphic(new ImageView(new Image(Constantes.URL_HERRAMIENTA + "HachaMetal.png")));
            }
            else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_MADERA && (obtenida.getClass().isAssignableFrom(Pico.class))) {
                boton.setGraphic(new ImageView(new Image(Constantes.URL_HERRAMIENTA + "PicoMadera.png")));
            }
            else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_PIEDRA && (obtenida.getClass().isAssignableFrom(Pico.class))) {
                boton.setGraphic(new ImageView(new Image(Constantes.URL_HERRAMIENTA + "PicoPiedra.png")));
            }
            else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_METAL && (obtenida.getClass().isAssignableFrom(Pico.class))) {
                boton.setGraphic(new ImageView(new Image(Constantes.URL_HERRAMIENTA + "PicoMetal.png")));
            }
            else if(obtenida.obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_FINO && (obtenida.getClass().isAssignableFrom(PicoFino.class))) {
                boton.setGraphic(new ImageView(new Image(Constantes.URL_HERRAMIENTA + "PicoFino.png")));
            }

            boton.setOnAction(event -> {
                CajaMusical.reproducir(CajaMusical.click);
                this.modeloJugador.equipar(indice);
                ponerImagenHerramienta(botonHerramientaEquipada, modeloJugador);
                this.elementos.getChildren().remove(botonHerramientaEquipada);
                this.elementos.getChildren().add(botonHerramientaEquipada);
            });


            botones.getChildren().add(boton);
        }

        //label del boton madera
        String i =  Integer.toString(modelo.cantidadDeMadera());
        Button botonLabelMadera = new Button(i);
        botonLabelMadera.setLayoutX(266);
        botonLabelMadera.setLayoutY(210);

        botones.getChildren().add(botonLabelMadera);

        //boton madera
        Button botonMadera = new Button();
        botonMadera.setLayoutX(266);
        botonMadera.setLayoutY(240);
        botonMadera.setGraphic(new ImageView(new Image("bloqueMaterial/BloqueMadera.png")));
        botonMadera.setOnAction(evento -> {
            modelo.seleccionarMadera();
            CajaMusical.reproducir(CajaMusical.click);
        });

        botones.getChildren().add(botonMadera);

        //label del boton piedra
        String j =  Integer.toString(modelo.cantidadDePiedra());
        Button botonLabelPiedra = new Button(j);
        botonLabelPiedra.setLayoutX(314);
        botonLabelPiedra.setLayoutY(210);

        botones.getChildren().add(botonLabelPiedra);

        //boton piedra
        Button botonPiedra = new Button();
        botonPiedra.setLayoutX(314);
        botonPiedra.setLayoutY(240);
        botonPiedra.setGraphic(new ImageView(new Image("bloqueMaterial/BloquePiedra.png")));
        botonPiedra.setOnAction(evento -> {
            modelo.seleccionarPiedra();
            CajaMusical.reproducir(CajaMusical.click);
        });

        botones.getChildren().add(botonPiedra);

        //label del boton metal
        String k =  Integer.toString(modelo.cantidadDeMetal());
        Button botonLabelMetal = new Button(k);
        botonLabelMetal.setLayoutX(362);
        botonLabelMetal.setLayoutY(210);

        botones.getChildren().add(botonLabelMetal);

        //boton metal
        Button botonMetal = new Button();
        botonMetal.setLayoutX(362);
        botonMetal.setLayoutY(240);
        botonMetal.setGraphic(new ImageView(new Image("bloqueMaterial/BloqueMetal.png")));
        botonMetal.setOnAction(evento -> {
            modelo.seleccionarMetal();
            CajaMusical.reproducir(CajaMusical.click);
        });

        botones.getChildren().add(botonMetal);

        //label del boton diamante
        String l =  Integer.toString(modelo.cantidadDeDiamante());
        Button botonLabelDiamante = new Button(l);
        botonLabelDiamante.setLayoutX(410);
        botonLabelDiamante.setLayoutY(210);

        botones.getChildren().add(botonLabelDiamante);

        //boton diamante
        Button botonDiamante = new Button();
        botonDiamante.setLayoutX(410);
        botonDiamante.setLayoutY(240);
        botonDiamante.setGraphic(new ImageView(new Image("bloqueMaterial/BloqueDiamante.png")));
        botonDiamante.setOnAction(evento -> {
            modelo.seleccionarDiamante();
            CajaMusical.reproducir(CajaMusical.click);
        });

        botones.getChildren().add(botonDiamante);

        //plantilla
        Button grilla11 = new Button();
        grilla11.setLayoutX(312);
        grilla11.setLayoutY(48);
        grilla11.setGraphic(new ImageView(new Image("slot2.png")));
        grilla11.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            actualizarImagen(grilla11, modelo);
            modelo.guardarSeleccionadoEnGrilla(0,0);} );

        botones.getChildren().add(grilla11);

        Button grilla12 = new Button();
        grilla12.setLayoutX(360);
        grilla12.setLayoutY(48);
        grilla12.setGraphic(new ImageView(new Image("slot2.png")));
        grilla12.setOnAction(evento ->{
            CajaMusical.reproducir(CajaMusical.click);
            actualizarImagen(grilla12,modelo);
            modelo.guardarSeleccionadoEnGrilla(0,1);
        } );

        botones.getChildren().add(grilla12);

        Button grilla13 = new Button();
        grilla13.setLayoutX(408);
        grilla13.setLayoutY(48);
        grilla13.setGraphic(new ImageView(new Image("slot2.png")));
        grilla13.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            actualizarImagen(grilla13,modelo);
            modelo.guardarSeleccionadoEnGrilla(0,2);
        } );

        botones.getChildren().add(grilla13);

        Button grilla21 = new Button();
        grilla21.setLayoutX(312);
        grilla21.setLayoutY(96);
        grilla21.setGraphic(new ImageView(new Image("slot2.png")));
        grilla21.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            actualizarImagen(grilla21,modelo);
            modelo.guardarSeleccionadoEnGrilla(1,0);
        } );

        botones.getChildren().add(grilla21);

        Button grilla22 = new Button();
        grilla22.setLayoutX(360);
        grilla22.setLayoutY(96);
        grilla22.setGraphic(new ImageView(new Image("slot2.png")));
        grilla22.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            actualizarImagen(grilla22,modelo);
            modelo.guardarSeleccionadoEnGrilla(1,1);
        } );

        botones.getChildren().add(grilla22);

        Button grilla23 = new Button();
        grilla23.setLayoutX(408);
        grilla23.setLayoutY(96);
        grilla23.setGraphic(new ImageView(new Image("slot2.png")));
        grilla23.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            actualizarImagen(grilla23,modelo);
            modelo.guardarSeleccionadoEnGrilla(1,2);
        } );

        botones.getChildren().add(grilla23);

        Button grilla31 = new Button();
        grilla31.setLayoutX(312);
        grilla31.setLayoutY(144);
        grilla31.setGraphic(new ImageView(new Image("slot2.png")));
        grilla31.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            actualizarImagen(grilla31,modelo);
            modelo.guardarSeleccionadoEnGrilla(2,0);
        } );

        botones.getChildren().add(grilla31);

        Button grilla32 = new Button();
        grilla32.setLayoutX(360);
        grilla32.setLayoutY(144);
        grilla32.setGraphic(new ImageView(new Image("slot2.png")));
        grilla32.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            actualizarImagen(grilla32,modelo);
            modelo.guardarSeleccionadoEnGrilla(2,1);
        } );

        botones.getChildren().add(grilla32);

        Button grilla33 = new Button();
        grilla33.setLayoutX(408);
        grilla33.setLayoutY(144);
        grilla33.setGraphic(new ImageView(new Image("slot2.png")));
        grilla33.setOnAction(evento -> {
            CajaMusical.reproducir(CajaMusical.click);
            actualizarImagen(grilla33,modelo);
            modelo.guardarSeleccionadoEnGrilla(2,2);
        } );

        botones.getChildren().add(grilla33);

        Button contruir = new Button("Construir");
        contruir.setLayoutX(240);
        contruir.setLayoutY(96);
        contruir.setOnAction(evento ->{
        CajaMusical.reproducir(CajaMusical.click);
        modelo.contruirHerramientaDeGrilla();
        grilla11.setGraphic(new ImageView(new Image("slot2.png")));
        grilla12.setGraphic(new ImageView(new Image("slot2.png")));
        grilla13.setGraphic(new ImageView(new Image("slot2.png")));
        grilla21.setGraphic(new ImageView(new Image("slot2.png")));
        grilla22.setGraphic(new ImageView(new Image("slot2.png")));
        grilla23.setGraphic(new ImageView(new Image("slot2.png")));
        grilla31.setGraphic(new ImageView(new Image("slot2.png")));
        grilla32.setGraphic(new ImageView(new Image("slot2.png")));
        grilla33.setGraphic(new ImageView(new Image("slot2.png")));});

        botones.getChildren().add(contruir);

        Button eliminar = new Button ("Eliminar material");
        eliminar.setLayoutX(266);
        eliminar.setLayoutY(280);
        eliminar.setOnAction(evento ->{
            CajaMusical.reproducir(CajaMusical.click);
            modelo.eliminarMaterial(modelo.obtenerMaterialSeleccionado());
        });

        botones.getChildren().add(eliminar);

        return botones;
    }


    private void ponerImagenHerramienta(Button herramienta, Jugador jugador ){

        if(jugador.obtenerHerramienta() == null){

            herramienta.setGraphic(new ImageView(new Image("slot3.png")));

        }else if ((jugador.obtenerHerramienta().getClass().isAssignableFrom(Hacha.class)) &&
                (jugador.obtenerHerramienta().obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_PIEDRA)){

            herramienta.setGraphic(new ImageView(new Image("herramientas/HachaPiedraActual.png")));

        }else if((jugador.obtenerHerramienta().getClass().isAssignableFrom(Hacha.class)) &&
                (jugador.obtenerHerramienta().obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_METAL)){

                herramienta.setGraphic(new ImageView(new Image("herramientas/HachaMetalActual.png")));

        } else if ((jugador.obtenerHerramienta().getClass().isAssignableFrom(Pico.class)) &&
                (jugador.obtenerHerramienta().obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_MADERA)){

                herramienta.setGraphic(new ImageView(new Image("herramientas/PicoMaderaActual.png")));

        }else if ((jugador.obtenerHerramienta().getClass().isAssignableFrom(Pico.class)) &&
                (jugador.obtenerHerramienta().obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_PIEDRA)){

                herramienta.setGraphic(new ImageView(new Image("herramientas/PicoPiedraActual.png")));

        }else if((jugador.obtenerHerramienta().getClass().isAssignableFrom(Pico.class)) &&
                (jugador.obtenerHerramienta().obtenerFuerza() == Constantes.FUERZA_INICIAL_PICO_METAL)){

                herramienta.setGraphic(new ImageView(new Image("herramientas/PicoMetalActual.png")));


        }else if (jugador.obtenerHerramienta().getClass().isAssignableFrom(PicoFino.class)){

            herramienta.setGraphic(new ImageView(new Image("herramientas/PicoFinoActual.png")));

        }else if ((jugador.obtenerHerramienta().getClass().isAssignableFrom(Hacha.class)) &&
                (jugador.obtenerHerramienta().obtenerFuerza() == Constantes.FUERZA_INICIAL_HACHA_MADERA)){

            herramienta.setGraphic(new ImageView(new Image("herramientas/HachaMaderaActual.png")));
        }


    }

    private void actualizarImagen(Button grilla, Inventario modelo){


        if(modelo.obtenerMaterialSeleccionado().getClass().isAssignableFrom(MaterialMadera.class) ){

            grilla.setGraphic(new ImageView(new Image("bloqueMaterial/BloqueMadera.png")));
            modelo.eliminarMaterial(new MaterialMadera());

        }else if (modelo.obtenerMaterialSeleccionado().getClass().isAssignableFrom(MaterialPiedra.class)){

            grilla.setGraphic(new ImageView(new Image("bloqueMaterial/BloquePiedra.png")));
            modelo.eliminarMaterial(new MaterialPiedra());

        }else if(modelo.obtenerMaterialSeleccionado().getClass().isAssignableFrom(MaterialMetal.class)){

            grilla.setGraphic(new ImageView(new Image("bloqueMaterial/BloqueMetal.png")));
            modelo.eliminarMaterial(new MaterialMetal());
        }

        this.elementos.getChildren().remove(grilla);
        this.elementos.getChildren().add(grilla);
    }

    public void observar(Observable observable) {

        if(observable instanceof Inventario) {
            Inventario modelo = (Inventario) observable;
            modelo.agregarObservador(this);
        }
    }
}

