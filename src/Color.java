
public class Color {
    //Constantes que permiten cambiar el color de texto y fondo de una cadena de texto.

    /**Cambiar color de texto a negro*/
    public static final String NEGRO = (char)27+"[049;30m";
    /**Cambiar color de texto a azul*/
    public static final String AZUL = (char)27+"[049;34m";
    /**Cambiar color de texto a rojo*/
    public static final String ROJO = (char)27+"[049;31m";
    /**Cambiar color de texto a verde*/
    public static final String VERDE = (char)27+"[049;32m";
    /**Cambiar color de texto a amarillo*/
    public static final String AMARILLO = (char)27+"[049;33m";
    /**Cambiar color de texto a blanco*/
    public static final String BLANCO = (char)27+"[049;37m";
    /**Cambiar color de texto a cyan*/
    public static final String CYAN = (char)27+"[049;36m";
    /**Cambiar color de texto a magenta*/
    public static final String MAGENTA = (char)27+"[049;35m";
    /**Cambiar color de fondo de texto a negro con color de texto negro*/
    public static final String FONDO_NEGRO = (char)27+"[040;30m";
    /**Cambiar color de fondo de texto a rojo con color de texto negro*/
    public static final String FONDO_ROJO = (char)27+"[041;30m";
    /**Cambiar color de fondo de texto a verde con color de texto negro*/
    public static final String FONDO_VERDE = (char)27+"[042;30m";
    /**Cambiar color de fondo de texto a amarillo con color de texto negro*/
    public static final String FONDO_AMARILLO = (char)27+"[043;30m";
    /**Cambiar color de fondo de texto a azul con color de texto negro*/
    public static final String FONDO_AZUL = (char)27+"[044;30m";
    /**Cambiar color de fondo de texto a magenta con color de texto negro*/
    public static final String FONDO_MAGENTA = (char)27+"[045;30m";
    /**Cambiar color de fondo de texto a cyan con color de texto negro*/
    public static final String FONDO_CYAN = (char)27+"[046;30m";
    /**Cambiar color de fondo de texto a blanco con color de texto negro*/
    public static final String FONDO_BLANCO = (char)27+"[047;30m";
    /**
     * Reiniciar color por defecto de la consola
     */
    public static final String REINICIAR = (char) 27 + "[000;30m";

}//Cierre de la clase TextColor.