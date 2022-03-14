package Ej1.Gestora;

import Ej1.Clases.Panini;
import Ej1.Clases.Pizza;
import Ej1.Mensajes.Mensajes;
import Ej1.Menu.Menu;
/*                              INTERFAZ PIZZERIA
*
* PROPIEDADES BÁSICAS:
* paninis: tipo Panini[], NO consultable y NO modificable
* pizzas: tipo Pizza[], NO consultable y NO modificable
*
* PROPIEDADES DERIVADAS: ninguna
*
* PROPIEDADES COMPARTIDAS:
* int MAXIMO_PIZZAS = 3 -> representando el máximo de pizzas que se pueden pedir por programa
* int MAXIMO_PANINIS = 2 -> representando el máximo de paninis que se pueden pedir por programa
* INT MINIMO_ALEATORIO= 1 -> cte auxiliar para generar numeros aleatorios para que se sirvan los platos aleatoriamente
*
* RESTRICCIONES: ninguna, se encarga de validar los métodos de la Clase Validaciones
*
* METODOS ANHIADIDOS:
* void instanciarPizzas()
* void instanciarPaninis()
* ingresarIngredientes()
* servirPlatosRandom()
* mostrarPlatos()
*
* */
public class Pizzeria {
    //Constantes
    public static final int MAXIMO_PIZZAS = 3;
    public static final int MAXIMO_PANINIS = 2;
    public static final int MINIMO_ALEATORIO = 1;
    //Atributos
    private Panini[] paninis;
    private Pizza[] pizzas;

    //Métodos
    //Constructor
    public Pizzeria() {
        //Instancia los paninis y pizzas con el máximo que puede pedir cada uno
        this.paninis = new Panini[MAXIMO_PANINIS];
        this.pizzas = new Pizza[MAXIMO_PIZZAS];
    }

    //Métodos públicos

    /*
    * Precondiciones: ninguna
    * Postcondiciones: llama a los métodos instanicarPizzas() y instanciarPaninis() simulando el pedido
    * de ingredientes y tamanio sobre las pizzas
    * Entrada: ninguna
    * Salida: ninguna
    *  */
    public void ingresarIngredientes() {
        instanciarPizzas();
        instanciarPaninis();
    }

    /*
     * Precondiciones: ninguna
     * Postcondiciones: genera numeros aleatorios no repetidos, y llama al método servir en 2 posiciones del array
     * pizzas y 1 posicion del array paninis, simulando la salida de la cocina de platos de forma aleatoria
     * Entrada: ninguna
     * Salida: ninguna
     *  */
    public void servirPlatosRandom() {
        Mensajes.displaySalidaPlatos();//Muestra por pantalla que comienzan a salir los platos
        //NOTA: los Random restan 1 al final para que la posicion vaya del plato 0 al numero de platos -1
        boolean salida = false;//Booleano para salir del bucle
        //TODO hacerlos métodos privaddos para pizza y para panini
        //Primer numeroRandom entre 0 y 2 para la primera pizza
        int posicionPizzaRandom1 = (int) Math.floor(Math.random() * (MAXIMO_PIZZAS - MINIMO_ALEATORIO + 1) + MINIMO_ALEATORIO) - 1;
        pizzas[posicionPizzaRandom1].servir();//Sirve la pizza en la posición random

        //Segundo numeroRandom entre 0 y 2 para la primera pizza, pero podría repetirse el número de arriba
        int posicionPizzaRandom2 = (int) Math.floor(Math.random() * (MAXIMO_PIZZAS - MINIMO_ALEATORIO + 1) + MINIMO_ALEATORIO) - 1;
        //While por si el numero pizzaRandom2 es el mismo que pizzaRandom1
        while (posicionPizzaRandom1==posicionPizzaRandom2) {
            posicionPizzaRandom2 = (int) Math.floor(Math.random() * (MAXIMO_PIZZAS - MINIMO_ALEATORIO + 1) + MINIMO_ALEATORIO) - 1;
        }
        pizzas[posicionPizzaRandom2].servir();//Sirve la pizza en la posición random


        //Para panini será mucho más facil ya que solo tiene que servir 1, con lo cual no se repetirá
        int posicionPaniniRandom = (int) Math.floor(Math.random() * (MAXIMO_PANINIS - MINIMO_ALEATORIO + 1) + MINIMO_ALEATORIO) - 1;
        paninis[posicionPaniniRandom].servir();//estaServido=true
    }

    /*
     * Precondiciones: ninguna
     * Postcondiciones: llama a los métodos mostrarPlatosServidos y mostrarPlatosNoServidos()
     * en los que el Menú se encargará de mostrar primero por pantalla los platos Servidos y luego los NO
     * Servidos
     * Entrada: ninguna
     * Salida: ninguna
     *  */
    public void mostrarPlatos() {
        Menu.mostrarPlatosServidos(pizzas, paninis);

        Menu.mostrarPlatosNoServidos(pizzas, paninis);
    }


    //Metodos privados


    //Recorre todas las posiciones de las pizzas (3), y en cada posición llama al método
    //ingresarPizza en Menú, instanciando un objeto tipo Pizza en esa posición hasta recorrer el array entero
    private void instanciarPizzas() {
        for (int i = 0; i < pizzas.length; i++) {
            pizzas[i] = Menu.ingresarPizza();//Instancias la pizza a través de este método
//            System.out.println(pizzas[i])
        }
    }

    //Recorre todas las posiciones de los paninis (2), y en cada posición llama al método
    //ingresarPanini en Menú, instanciando un objeto tipo Panini en esa posición hasta recorrer el array entero
    private void instanciarPaninis() {
        Mensajes.displayComienzoPaninis();//Muestra mensaje diciendo que comienza el pedido de los paninis
        for (int i = 0; i < paninis.length; i++) {
            paninis[i] = Menu.ingresarPanini();//Instancias el panini a través de este método
//            System.out.println(paninis[i])
        }
    }

}
