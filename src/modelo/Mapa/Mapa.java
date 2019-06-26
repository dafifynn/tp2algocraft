package modelo.Mapa;

import modelo.Excepciones.CoordenadaOcupadaException;
import modelo.Excepciones.MaterialInexistenteException;
import modelo.Juego.Artista;
import modelo.Material.Material;
import modelo.Material.MaterialVacio;

import java.io.Console;
import java.util.*;

public class Mapa extends Observable {

    // Atributo
    private HashMap<Coordenada, Material> materialesDelMapa;

    List<Observer> observadores;


    // Constructor
    public Mapa() {

        this.materialesDelMapa = new HashMap<>();
        this.observadores = new ArrayList<>();
        Artista artista = new Artista();
        artista.crearTerreno(this);
    }


    // Getter
    public Material obtenerMaterial (Coordenada coordenada) throws MaterialInexistenteException {
        if (!this.hayMaterialEnCoordenada(coordenada)) {
            throw new MaterialInexistenteException();
        }

        return this.materialesDelMapa.get(coordenada);
    }

    // Setter
    public void agregarMaterial (Coordenada unaCoordenada, Material unMaterial) throws CoordenadaOcupadaException {
        if (this.hayMaterialEnCoordenada(unaCoordenada)) {
            throw new CoordenadaOcupadaException();
        }
        materialesDelMapa.put(unaCoordenada, unMaterial);
    }


    // Metodos publicos
    public boolean hayMaterialEnCoordenada (Coordenada coordenada) {

        return this.materialesDelMapa.containsKey(coordenada);
    }


    public void removerMaterialDelMapa(Coordenada coordenada) throws MaterialInexistenteException {

        if (!this.hayMaterialEnCoordenada(coordenada)) {
            throw new MaterialInexistenteException();
        }

        this.materialesDelMapa.remove(coordenada);
        this.notificar(coordenada);
    }

    public void agregarObservador(Observer nuevo) {

        this.observadores.add(nuevo);
    }

    public void notificar(Coordenada coordenada) {

        for(Observer observador : this.observadores) {
            observador.update(this,coordenada);
        }
    }

}
