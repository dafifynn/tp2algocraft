package modelo;


public final class Constantes {

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
    
     // Inventario
    public static final int MAXIMA_CAPACIDAD_DE_INVENTARIO = 36;
    

    // Representacion Numerica de las combinaciones de construccion de herramientas
    // Madera: 1, Piedra: 2, Metal: 3, Diamante: 4, Vacio: 0.

    public static final String HACHA_DE_MADERA = "110110010";

    public static final String HACHA_DE_PIEDRA = "220210010";

    public static final String HACHA_DE_METAL = "330310010";

    public static final String PICO_DE_MADERA = "111010010";

    public static final String PICO_DE_PIEDRA = "222010010";

    public static final String PICO_DE_METAL = "333010010";

    public static final String PICO_FINO = "333210010";

}
