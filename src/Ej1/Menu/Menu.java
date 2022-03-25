package Ej1.Menu;


import Ej1.Clases.Panini;
import Ej1.Clases.Pizza;
import Ej1.Enums.TamanioPanini;
import Ej1.Enums.TamanioPizza;
import Ej1.Enums.Tipo;
import Ej1.Mensajes.Mensajes;
import Ej1.Validaciones.Validaciones;

import java.util.Scanner;

//Clase Menú que se encargará de llamar a las clases Mensajes y Validaciones, para mostrar por pantalla mensajes
//y validar datos ingresados, también se encargará de guardar e ingresar datos
public class Menu {

    private static Scanner tec = new Scanner(System.in);


    //Se muestra un mensaje pregunta que especialidad quieres, luego lo escribes por pantalla
    //y la clase Validaciones se encarga de validar lo ingresado, luego de ser validado,
    //se elige una opcion dependiendo de lo que hayas ingresado
    private static Tipo ingresarTipo(){
        String tipoCadena;
        Tipo tipo=null;
        Mensajes.displayTipoEspecialidad();
        tipoCadena=tec.nextLine();
        tipoCadena= Validaciones.validarTipo(tipoCadena);
        switch (tipoCadena){
            case "MARGARITA"->tipo=Tipo.MARGARITA;
            case "CUATRO QUESOS"->tipo=Tipo.CUATRO_QUESOS;
            case "FUNGHI"->tipo=Tipo.FUNGHI;
        }
        return tipo;
    }

    //Se muestra un mensaje pregunta que tamanio de pizza quieres, luego lo escribes por pantalla
    //y la clase Validaciones se encarga de validar lo ingresado, luego de ser validado,
    //se elige una opcion dependiendo de lo que hayas ingresado
    private static TamanioPizza ingresarTamanioPizza(){
        String tamanioCadena;
        TamanioPizza tamanio=null;
        Mensajes.displayTamanioPizza();
        tamanioCadena=tec.nextLine();
        tamanioCadena=Validaciones.validarTamanioPizza(tamanioCadena);
        switch (tamanioCadena){
            case "MEDIANA"->tamanio=TamanioPizza.MEDIANA;
            case "FAMILIAR"->tamanio=TamanioPizza.FAMILIAR;
        }
        return tamanio;
    }

    //Llamas a los métodos ingresarTamanioPizza y ingresarTipo simulando los ingredientes
    //y tamanio que quieres de esta, luego instancia un objeto tipo pizza con los valores
    //ingresados en los métodos privados, luego devuelve esta pizza instanciada
    //TODO ponerlo como publico
    public static Pizza ingresarPizza(){
        TamanioPizza tamanioPizza=ingresarTamanioPizza();
        Tipo tipoPizza=ingresarTipo();
        //Instancia la pizza
        Pizza pizza= new Pizza(tipoPizza, tamanioPizza);
        return pizza;
    }

    //Se muestra un mensaje pregunta que tamanio de panini quieres, luego lo escribes por pantalla
    //y la clase Validaciones se encarga de validar lo ingresado, luego de ser validado,
    //se elige una opcion dependiendo de lo que hayas ingresado
    private static TamanioPanini ingresarTamanioPanini(){
        String tamanioCadena;
        TamanioPanini tamanio=null;
        Mensajes.displayTamanioPanini();
        tamanioCadena=tec.nextLine();
        tamanioCadena=Validaciones.validarTamanioPanini(tamanioCadena);
        switch (tamanioCadena){
            case "ALMERIA"->tamanio=TamanioPanini.ALMERIA;
            case "GRANADA"->tamanio=TamanioPanini.GRANADA;
            case "SEVILLA"->tamanio=TamanioPanini.SEVILLA;
        }
        return tamanio;
    }

    //Se muestra un mensaje pregunta que tamanio de pizza quieres, luego lo escribes por pantalla
    //y la clase Validaciones se encarga de validar lo ingresado, luego de ser validado,
    //se elige una opcion dependiendo de lo que hayas ingresado
    private static boolean ingresarPaniniDoble(){
        String tamanioCadena;
        boolean esDoble=false;
        Mensajes.displayPaniniDoble();
        tamanioCadena=tec.nextLine();
        tamanioCadena=Validaciones.validarPaniniDoble(tamanioCadena);
        switch (tamanioCadena){
            case "DOBLE"->esDoble=true;
            //No ponemos case "SIMPLE" ya que por defecto es false

        }
        return esDoble;
    }


    //TODO switch y demas que lo haga la gestora, yo tengo que ingresar Menu, validar Validaciones y mensajes Mensajes
    //la controladora se encarga de hacer wl swtich




    //TODO terminar de comentar
    public static Panini ingresarPanini(){

        Tipo tipoPanini= ingresarTipo();
        TamanioPanini tamanioPanini=ingresarTamanioPanini();
        boolean esDoble=ingresarPaniniDoble();
        //Instanciamos el panini
        Panini panini= new Panini(tipoPanini,tamanioPanini,esDoble);

        return panini;
    }


    public static void mostrarPlatosServidos(Pizza[] pizzas, Panini[] paninis) {
        Mensajes.displayMostrarPlatosServidos();
        for (int i=0;i< pizzas.length;i++){
            if (pizzas[i].isEstaServida()){
                Mensajes.mostrarPizza(pizzas,i);
            }
        }

        for (int i=0;i< paninis.length;i++){
            if (paninis[i].isEstaServida()){
                Mensajes.mostrarPanini(paninis,i);
            }
        }

    }


    public static void mostrarPlatosNoServidos(Pizza[] pizzas, Panini[] paninis) {
        Mensajes.displayMostrarPlatosNoServidos();

        for (int i=0;i< pizzas.length;i++){
            if (!pizzas[i].isEstaServida()){
                Mensajes.mostrarPizza(pizzas,i);
            }
        }

        for (int i=0;i< paninis.length;i++){
            if (!paninis[i].isEstaServida()){
                Mensajes.mostrarPanini(paninis,i);
            }
        }
    }
}