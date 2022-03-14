package Ej1.Main;

import Ej1.Gestora.Pizzeria;
import Ej1.Mensajes.Mensajes;

public class Main {
    public static void main(String[] args) {

        Mensajes.displayMensajeBienvenida();//Muestra un mensaje de bienvenida

        Pizzeria laTraviata = new Pizzeria();//Instancia la pizzeria

        laTraviata.ingresarIngredientes();//Ingresas las pizzas y paninis que quieres

        laTraviata.servirPlatosRandom();//Se sirven 2 pizzas y 1 panini de forma aleatoria

        laTraviata.mostrarPlatos();//Se muestran por pantalla los platos en orden Servidos->No Servidos

    }

}
//        //Creamos 3 pizzas y 2 paninis
//        Pizza margaritaFamiliar = new Pizza(Tipo.MARGARITA, TamanioPizza.FAMILIAR);
//
//        Pizza cuatroQuesosMediana = new Pizza(Tipo.CUATRO_QUESOS,TamanioPizza.MEDIANA);
//
//        Pizza funghiFamiliar = new Pizza(Tipo.FUNGHI, TamanioPizza.FAMILIAR);
//
//        Panini paniniSimple= new Panini(Tipo.CUATRO_QUESOS, TamanioPanini.SEVILLA, true);
//
//        Panini paniniDoble = new Panini(Tipo.MARGARITA, TamanioPanini.ALMERIA, false);
//
//        //Servimos 2 pizzas y 1 panini
//
//        margaritaFamiliar.servir();
//
//        funghiFamiliar.servir();
//
//        paniniDoble.servir();
//
//        System.out.println(Pizza.getNumeroPizzasPedidas());
//
//        System.out.println(margaritaFamiliar);
//
//        System.out.println(cuatroQuesosMediana);
//        System.out.println(funghiFamiliar);
//        System.out.println(paniniSimple);
//        System.out.println(paniniDoble);