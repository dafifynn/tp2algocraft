package modelo.Mapa;

import modelo.Constantes;
import modelo.Excepciones.CoordenadaFueraDelLimiteException;

public class Coordenada {

    // Atributos
    private int coordenadaFila;
    private int coordenadaColumna;


    // Constructor
    public Coordenada (int coordenadaFila, int coordenadaColumna) throws CoordenadaFueraDelLimiteException {

        if (!estaEnRango(coordenadaFila, coordenadaColumna)) {
            throw new CoordenadaFueraDelLimiteException();
        }
        this.coordenadaFila = coordenadaFila;
        this.coordenadaColumna = coordenadaColumna;
    }

    // Getters
    public int obtenerFila () {
        return this.coordenadaFila;
    }

    public int obtenerColumna() {
        return this.coordenadaColumna;
    }

    // Metodos Privados
    private boolean esCoordenadaColumnaValida (int coordenadaColumna) {

        return (0 <= coordenadaColumna) && (coordenadaColumna <= Constantes.MAPA_COLUMNAS_DEFECTO);
    }


    private boolean esCoordenadaFilaValida (int coordenadaFila) {

        return (0 <=  coordenadaFila) && (coordenadaFila <= Constantes.MAPA_FILAS_DEFECTO);
    }


    private boolean estaEnRango (int coordenadaFila, int coordenadaColumna) throws CoordenadaFueraDelLimiteException {

        return this.esCoordenadaFilaValida(coordenadaFila) && this.esCoordenadaColumnaValida(coordenadaColumna);
    }


    // Metodos Publicos
    public void moverCoordenada (int cantMovimientosFila, int cantMovimientosColumna) {

        int nuevaCoordenadaFila = this.coordenadaFila + cantMovimientosFila;
        int nuevaCoordenadaColumna = this.coordenadaColumna + cantMovimientosColumna;

        if (this.estaEnRango(nuevaCoordenadaFila, nuevaCoordenadaColumna)) {

            this.coordenadaFila = nuevaCoordenadaFila;
            this.coordenadaColumna = nuevaCoordenadaColumna;
        }
    }


    public Coordenada crearCoordenadaAdyacente (int cantMovimientosFila, int cantMovimientosColumna) {

        int nuevaCoordenadaFila = this.coordenadaFila + cantMovimientosFila;
        int nuevaCoordenadaColumna = this.coordenadaColumna + cantMovimientosColumna;

        return new Coordenada(nuevaCoordenadaFila, nuevaCoordenadaColumna);
    }


    public boolean tienenCoordenadasIguales (int coordenadaFila, int coordenadaColumna) {
        return (this.coordenadaFila == coordenadaFila) && (this.coordenadaColumna == coordenadaColumna);
    }

    @Override
    public boolean equals (Object o) {

        if(!(o instanceof Coordenada)) { return false;}

        Coordenada otraCoordenada = (Coordenada) o;
        return otraCoordenada.tienenCoordenadasIguales(this.coordenadaFila, this.coordenadaColumna);
    }

    @Override
    public int hashCode() {

        int code = this.coordenadaColumna + (this.coordenadaFila * 1000);

        return code;
    }
}
