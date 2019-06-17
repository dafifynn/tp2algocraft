package modelo.Mapa;

import modelo.Excepciones.CoordenadaOcupadaException;
import modelo.Jugador.Jugador;
import modelo.Material.Material;
import modelo.Acciones.Movimiento;

import java.util.HashMap;

public class Mapa {

    // Atributo
    private HashMap<Coordenada, Material> materialesDelMapa;


    // Constructor
    public Mapa() {

        this.materialesDelMapa = new HashMap<>();
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


    public void removerMaterialDelMapa(Coordenada coordenada) {

        this.materialesDelMapa.remove(coordenada);
    }

}
