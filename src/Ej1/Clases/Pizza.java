package Ej1.Clases;

import Ej1.Enums.TamanioPizza;
import Ej1.Enums.Tipo;

/*                              INTERFAZ PIZZA
 *
 * PROPIEDADES BÁSICAS:
 * tamanio: tipo TamanioPizza Enum, consultable y NO modificable
 * esDoble: tipo booleano, consultable y NO modificable
 *
 * PROPIEDADES DERIVADAS: ninguna
 *
 * PROPIEDADES COMPARTIDAS: ninguna
 *
 * RESTRICCIONES: ninguna
 *
 * METODOS ANHIADIDOS:
 * Gets de las propiedades consultables
 * String toString
 *
 * HERENCIA: Clase HIJA de la clase ComidaItaliana
 *
 * */
public class Pizza extends ComidaItaliana{
    //Atributos
    private TamanioPizza tamanio;

    //Metodos
    //Constructor
    public Pizza(Tipo tipo, TamanioPizza tamanio) {
        super(tipo);
        this.tamanio=tamanio;
    }
    //Gets

    private TamanioPizza getTamanio() {
        return tamanio;
    }


    //ToString que utiliza el toString de la clase padre
    @Override
    public String toString() {
        return  "Pizza: " +
                super.toString() +
                "\ntamanio pizza: "+getTamanio() +
                "\n";
    }
}
