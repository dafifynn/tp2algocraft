package vista;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.Constantes;
import modelo.Excepciones.NoHayMaterialParaEliminarException;
import modelo.Herramienta.Herramienta;
import modelo.Jugador.Inventario;
import modelo.Jugador.Jugador;

import java.util.Observable;
import java.util.Observer;

public class InventarioVista implements Observer {

    private Scene vista;
    private Group elementos;

    private Button botonLabelMadera;
    private Button botonLabelPiedra;
    private Button botonLabelMetal;
    private Button botonLabelDiamante;

    private Button botonesDeHerramientas[];

    private Button botonesDePlantilla[][];

    private Button botonHerramientaEquipada;

    private Jugador modeloJugador;

    public InventarioVista(Inventario modeloInventario, Jugador modeloJugador) {

        this.modeloJugador = modeloJugador;

        this.elementos = crearBotones(modeloInventario, modeloJugador);
        this.inicializarBotonesDeMaterial(modeloJugador.obtenerInventario());
        this.inicializarBotonesDeCantidadDeMateriales(modeloJugador.obtenerInventario());
        this.actualizarCantidadDeBotonesLabel(modeloJugador.obtenerInventario());

        this.inicializarBotonesDeHerramientas(modeloJugador);

        this.inicicializarBotonesPlantilla(modeloInventario);

        this.inicializarBotonesDeHerramientaActual();
        this.ponerImagenHerramienta(modeloJugador);

        this.vista = new Scene(elementos,480,480);
    }

    @Override
    public void update(Observable observable, Object arg) {

        if(observable instanceof Inventario) {

            Inventario actualizado = (Inventario) observable;
            this.actualizarCantidadDeBotonesLabel(actualizado);
            this.actualizarImagenesDeHerramientas(actualizado);
        }
        else if (observable instanceof Jugador) {
            Jugador actualizado = (Jugador) observable;
            this.ponerImagenHerramienta(actualizado);
        }

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


    private void inicializarBotonesDeCantidadDeMateriales (Inventario modelo) {
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

    private void inicicializarBotonesPlantilla(Inventario modelo) {
        this.botonesDePlantilla = new Button[3][3];

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                this.botonesDePlantilla[i][j] = new Button();
                this.botonesDePlantilla[i][j].setLayoutX(312 + (j * 48));
                this.botonesDePlantilla[i][j].setLayoutY(48 + (i * 48));
                this.botonesDePlantilla[i][j].setGraphic(new ImageView(new Image("slot2.png")));

                Button boton = this.botonesDePlantilla[i][j];
                int fila = i;
                int columna = j;

                this.botonesDePlantilla[i][j].setOnAction(evento -> {
                    try{
                        CajaMusical.reproducir(CajaMusical.click);
                        actualizarImagenGrilla(boton , modelo);
                        modelo.guardarSeleccionadoEnGrilla(fila,columna);
                        actualizarImagenesDeHerramientas(modelo);
                    }
                    catch (NoHayMaterialParaEliminarException e) {
                        CajaMusical.reproducir(CajaMusical.vidrio);
                    }


                });

                this.elementos.getChildren().add(this.botonesDePlantilla[i][j]);
            }
        }
    }

    private void limpiarBotontesPlantilla() {
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                this.botonesDePlantilla[i][j].setGraphic(new ImageView(new Image("slot2.png")));
            }
        }
    }

    private void actualizarImagenGrilla(Button botonGrilla, Inventario modelo){

        modelo.eliminarMaterial(modelo.obtenerMaterialSeleccionado());
        botonGrilla.setGraphic(Libreria.buscarUnidadDeMaterial(modelo.obtenerMaterialSeleccionado()));
    }

    private Group crearBotones(Inventario modelo, Jugador modeloJugador) {

        Group botones = new Group();

        Button contruir = new Button("Construir");
        contruir.setLayoutX(240);
        contruir.setLayoutY(96);
        contruir.setOnAction(evento ->{
            CajaMusical.reproducir(CajaMusical.click);
            modelo.contruirHerramientaDeGrilla();
            this.limpiarBotontesPlantilla();});

        botones.getChildren().add(contruir);

        Button eliminar = new Button ("Eliminar material");
        eliminar.setLayoutX(266);
        eliminar.setLayoutY(280);
        eliminar.setOnAction(evento ->{
            try {
                CajaMusical.reproducir(CajaMusical.click);
                modelo.eliminarMaterial(modelo.obtenerMaterialSeleccionado());
            }
            catch (NoHayMaterialParaEliminarException e) {

            }
        });

        botones.getChildren().add(eliminar);

        return botones;
    }


    public void observar(Observable observable) {

        if(observable instanceof Inventario) {
            Inventario modelo = (Inventario) observable;
            modelo.agregarObservador(this);
        }
        else if(observable instanceof Jugador) {
            Jugador modelo = (Jugador) observable;
            modelo.agregarObservador(this);
        }
    }


    private void actualizarImagenDeHerramienta (int i, Inventario modelo) {
        Herramienta obtenida = modelo.obtenerHerramienta(i);
        this.botonesDeHerramientas[i].setGraphic(Libreria.buscarHerramientaInventario(obtenida));
    }

    private void actualizarImagenesDeHerramientas(Inventario modelo) {
        for(int i = 0; i < Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_HERRAMIENTAS ; i++) {

            this.actualizarImagenDeHerramienta(i, modelo);
        }
    }

    private void inicializarBotonesDeHerramientas(Jugador jugador) {
        this.botonesDeHerramientas = new Button[Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_HERRAMIENTAS];

        for(int i = 0; i < Constantes.MAXIMA_CAPACIDAD_DE_INVENTARIO_HERRAMIENTAS ; i++) {

            this.botonesDeHerramientas[i] = new Button();
            this.botonesDeHerramientas[i].setLayoutX(24 + (i * 48));
            this.botonesDeHerramientas[i].setLayoutY(400);
            this.botonesDeHerramientas[i].setGraphic(new ImageView("slot2.png"));

            int indice = i;
            this.botonesDeHerramientas[i].setOnAction(event -> {
                CajaMusical.reproducir(CajaMusical.click);
                this.modeloJugador.equipar(indice);
                this.ponerImagenHerramienta(jugador);
            });

            this.elementos.getChildren().add(this.botonesDeHerramientas[i]);

        }

    }

    private void ponerImagenHerramienta (Jugador jugador) {
        Herramienta herramienta = jugador.obtenerHerramienta();
        this.botonHerramientaEquipada.setGraphic(Libreria.buscarHerrammientaEquipada(herramienta));
    }

    private void inicializarBotonesDeHerramientaActual () {
        this.botonHerramientaEquipada = new Button();
        this.botonHerramientaEquipada.setLayoutY(24);
        this.botonHerramientaEquipada.setLayoutX(24);

        this.elementos.getChildren().add(this.botonHerramientaEquipada);
    }
}


