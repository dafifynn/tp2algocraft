package modelo.Mapa;

import modelo.Excepciones.CoordenadaOcupadaException;
import modelo.Excepciones.MaterialInexistenteException;
import modelo.Juego.Artista;
import modelo.Material.Material;
import modelo.Material.MaterialVacio;

import java.io.Console;
import java.util.HashMap;

public class Mapa {

    // Atributo
    private HashMap<Coordenada, Material> materialesDelMapa;


    // Constructor
    public Mapa() {

        this.materialesDelMapa = new HashMap<>();
        Artista artista = new Artista();
        artista.crearTerreno(this);
    }


    // Getter
    public Material obtenerMaterial (Coordenada coordenada) throws MaterialInexistenteException {

//        if (!this.hayMaterialEnCoordenada(coordenada)) {
//            throw new MaterialInexistenteException();
//        }
        boolean existeMaterial = this.hayMaterialEnCoordenada(coordenada);

        return existeMaterial ? this.materialesDelMapa.get(coordenada) : new MaterialVacio();
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
    }

}
