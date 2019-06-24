package modelo;


public final class Constantes {

    // Vista
    public static final int PIXELES = 16;

    // Mapa
    public static final int MAPA_FILAS_DEFECTO = 29;

    public static final int MAPA_COLUMNAS_DEFECTO = 29;


    // Comandos
    public static final String MOV_ARRIBA = "W";

    public static final String MOV_ABAJO = "S";

    public static final String MOV_IZQ = "A";

    public static final String MOV_DER = "D";

    public static final String GOLP_ARRIBA = "I";

    public static final String GOLP_ABAJO = "K";

    public static final String GOLP_IZQ = "J";

    public static final String GOLP_DER = "L";

    public static final String FIN_DE_JUEGO = "T";


    // Jugador
    public static final int JUGADOR_COORDENADA_FILA_DEFECTO = 18;

    public static final int JUGADOR_COORDENADA_COLUMNA_DEFECTO = 15;

    public static final String NORTE = "N";

    public static final String SUR = "S";

    public static final String OESTE = "O";

    public static final String ESTE = "E";


    // Hacha Madera
    public static final double DURABILIDAD_INICIAL_HACHA_MADERA = 100;

    public static final double FUERZA_INICIAL_HACHA_MADERA = 2;

    public static final double VALOR_DE_DESGASTE_DE_HACHA_MADERA = 2;

    // Hacha Metal
    public static final double DURABILIDAD_INICIAL_HACHA_METAL = 400;

    public static final double FUERZA_INICIAL_HACHA_METAL = 10;

    public static final double VALOR_DE_DESGASTE_DE_HACHA_METAL = 5;

    // Hacha Piedra
    public static final double DURABILIDAD_INICIAL_HACHA_PIEDRA = 200;

    public static final double FUERZA_INICIAL_HACHA_PIEDRA = 5;

    public static final double VALOR_DE_DESGASTE_DE_HACHA_PIEDRA = 5;


    // Pico Madera
    public static final double DURABILIDAD_INICIAL_PICO_MADERA = 100;

    public static final double FUERZA_INICIAL_PICO_MADERA = 2;

    public static final double VALOR_DE_DESGASTE_DE_PICO_MADERA = 2;

    // Pico Piedra
    public static final double DURABILIDAD_INICIAL_PICO_PIEDRA = 200;

    public static final double FUERZA_INICIAL_PICO_PIEDRA = 4;

    public static final double VALOR_DE_DESGASTE_DE_PICO_PIEDRA = FUERZA_INICIAL_PICO_PIEDRA / 1.5;

    // Pico Metal
    public static final double DURABILIDAD_INICIAL_PICO_METAL = 400;

    public static final double FUERZA_INICIAL_PICO_METAL = 12;

    public static final double VALOR_DE_DESGASTE_DE_PICO_METAL = 0;

    public static final double CANTIDAD_DE_USOS_DE_PICO_METAL = 10;


    // Pico Fino
    public static final double DURABILIDAD_INICIAL_PICO_FINO = 1000;

    public static final double FUERZA_INICIAL_PICO_FINO = 20;

    public static final double VALOR_DE_DESGASTE_DE_PICO_FINO = 0.1;


    // Material Madera
    public static final double DURABILIDAD_INICIAL_BLOQUE_MADERA = 10;

    public static final double RESISTENCIA_INICIAL_BLOQUE_MADERA = FUERZA_INICIAL_HACHA_MADERA;

    // Material Piedra
    public static final double DURABILIDAD_INICIAL_BLOQUE_PIEDRA = 30;

    public static final double RESISTENCIA_INICIAL_BLOQUE_PIEDRA = FUERZA_INICIAL_PICO_MADERA;

    // Material Metal
    public static final double DURABILIDAD_INICIAL_BLOQUE_METAL = 50;

    public static final double RESISTENCIA_INICIAL_BLOQUE_METAL = FUERZA_INICIAL_PICO_PIEDRA;

    // Material Diamante
    public static final double DURABILIDAD_INICIAL_BLOQUE_DIAMANTE = 100;

    public static final double RESISTENCIA_INICIAL_BLOQUE_DIAMANTE = FUERZA_INICIAL_PICO_FINO;

    // MATERIAL VACIO
    public static final double DURABILIDAD_INICIAL_BLOQUE_VACIO = 9999;

    public static final double RESISTENCIA_INICIAL_BLOQUE_VACIO = 9999;

     // Inventario
    public static final int MAXIMA_CAPACIDAD_DE_INVENTARIO_MATERIALES = 36;

    public static final int MAXIMA_CAPACIDAD_DE_INVENTARIO_HERRAMIENTAS = 10;

    public static final int FILAS_INVENTARIO = 30;

    public static final int COLUMNAS_INVENTARIO = 30;


    // Vacio
    public static final int VACIO = 0;


}
