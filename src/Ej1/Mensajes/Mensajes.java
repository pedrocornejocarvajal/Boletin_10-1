package Ej1.Mensajes;

import Ej1.Clases.Panini;
import Ej1.Clases.Pizza;

import java.security.PublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.SortedMap;

//Clase que utilizará la clase Menú, o la gestora para mostrar por pantalla un mensaje
public class Mensajes {
    //Constantes que usarán los métodos para mostrar por pantalla
    public static final String MENSAJE_BIENVENIDA = """
            Bienvenido, a continuación le mostraremos las opciones que tiene para 
            elegir pizzas y paninis
            """;

    public static final String TIPO_ESPECIALIDAD= "¿Qué prefiere, MARGARITA, CUATRO QUESOS O FUNGHI?";

    public static final String DATO_INCORRECTO="Has ingresado un valor incorrecto tonto, lo volveré a repetir";

    public static final String TAMANIO_PIZZA="¿Deseas la pizza MEDIANA o FAMILIAR?";

    public static final String PEDIDO_PANINIS="Muy bien, comenzemos a pedir ahora los paninis";

    public static final String TAMANIO_PANINI="¿De qué tamanio quieres el panini, ALMERIA, GRANADA O SEVILLA?";

    public static final String PANINI_DOBLE="¿Quieres un panini SIMPLE ó DOBLE?";

    public static final String SALIDA_PLATOS="Muy bien, enseguida saldrán 2 pizzas y panini elegidos aleatoriamente";

    public static final String PLATOS_SERVIDOS="Comenzaremos mostrando los platos servidos, empezando por las pizzas";

    public static final String PLATOS_NO_SERVIDOS="Ahora mostraremos los platos no servidos";


    //Métodos que muestran por pantalla las ctes de arriba

    public static void displayMensajeBienvenida(){
        System.out.println(MENSAJE_BIENVENIDA);
    }

    public static void displayDatoIncorrecto(){
        System.out.println(DATO_INCORRECTO);
    }

    public static void displayTipoEspecialidad(){
        System.out.println(TIPO_ESPECIALIDAD);
    }

    public static void displayTamanioPizza(){
        System.out.println(TAMANIO_PIZZA);
    }

    public static void displayTamanioPanini(){
        System.out.println(TAMANIO_PANINI);
    }

    public static void displayPaniniDoble(){
        System.out.println(PANINI_DOBLE);
    }


    public static void displayComienzoPaninis() {
        System.out.println(PEDIDO_PANINIS);
    }

    public static void displaySalidaPlatos() {
        System.out.println(SALIDA_PLATOS);
    }

    public static void displayMostrarPlatosServidos() {
        System.out.println(PLATOS_SERVIDOS);
    }

    //Muestra por pantalla una pizza del array pizzas[] en la posicion i
    public static void mostrarPizza(Pizza[] pizzas, int i) {
        System.out.println(pizzas[i]);
    }

    public static void displayMostrarPlatosNoServidos() {
        System.out.println(PLATOS_NO_SERVIDOS);
    }

    //Muestra por pantalla un panini del array paninis[] en la posicion i
    public static void mostrarPanini(Panini[] paninis, int i) {
        System.out.println(paninis[i]);
    }


}
