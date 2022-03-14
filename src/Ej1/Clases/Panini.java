package Ej1.Clases;

import Ej1.Enums.TamanioPanini;
import Ej1.Enums.Tipo;

/*                              INTERFAZ PANINI
 *
 * PROPIEDADES BÁSICAS:
 * tamanio: tipo TamanioPanini Enum, consultable y NO modificable
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

public class Panini extends ComidaItaliana{
    //Atributos
    private TamanioPanini tamanio;
    private boolean esDoble;

    //Metodos

    //Constructor
    public Panini(Tipo tipo, TamanioPanini tamanio, boolean esDoble) {
        super(tipo);
        this.tamanio=tamanio;
        this.esDoble = esDoble;
    }

    //Gets

    private TamanioPanini getTamanio() {
        return tamanio;
    }


    private boolean isEsDoble() {
        return esDoble;
    }

    //ToString que utiliza el toString de la clase padre
    @Override
    public String toString() {
        return "Panini: "+
                super.toString() +
                "\ntamanio : "+getTamanio() +
                "\nesDoble: "+ isEsDoble()+
                "\n";
    }
}
