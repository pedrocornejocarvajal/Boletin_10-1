package Ej1.Validaciones;

import Ej1.Mensajes.Mensajes;

import java.util.Scanner;

//Clase para validar datos ingresados en los métodos de la clase Menú
public class Validaciones {

    private static Scanner tec = new Scanner(System.in);//TODO duda se me repitiría en Menu y Validaciones

    //Todos los métodos de la clase Validaciones devuelven el mismo parametro que entrada
    //ya validado, si pusiesemos que no devuelve nada (void), al ingresar un valor inválido
    //llamar a la validación, e ingresar un valor válido, no se guardaría en ningún valor de
    //retorno la variable validada

    //todo HACER TODOS que devuelvan booleano y que siga pidiendo en el Menu, para poder quitar Scanner

    public static String validarTipo(String tipo){
        while(!(tipo.equals("MARGARITA") || tipo.equals("CUATRO QUESOS") || tipo.equals("FUNGHI"))){
            Mensajes.displayDatoIncorrecto();
            Mensajes.displayTipoEspecialidad();
            tipo=tec.nextLine();
        }
        return tipo;
    }

    public static String validarTamanioPizza(String tamanio){
        while (!(tamanio.equals("MEDIANA") || tamanio.equals("FAMILIAR"))){
            Mensajes.displayDatoIncorrecto();
            Mensajes.displayTamanioPizza();
            tamanio=tec.nextLine();
        }
        return tamanio;
    }

    public static String validarTamanioPanini(String tamanio){
        while (!(tamanio.equals("SEVILLA") || tamanio.equals("ALMERIA") || tamanio.equals("GRANADA"))){
            Mensajes.displayDatoIncorrecto();
            Mensajes.displayTamanioPanini();
            tamanio=tec.nextLine();
        }
        return tamanio;
    }

    public static String validarPaniniDoble(String tamanio){
        while (!(tamanio.equals("SIMPLE") || tamanio.equals("DOBLE"))){
            Mensajes.displayDatoIncorrecto();
            Mensajes.displayPaniniDoble();
            tamanio=tec.nextLine();
        }
        return tamanio;
    }
}
