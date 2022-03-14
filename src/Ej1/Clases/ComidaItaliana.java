package Ej1.Clases;

import Ej1.Enums.Tipo;

/*                              INTERFAZ COMIDA ITALIANA
 *
 * PROPIEDADES BÁSICAS:
 * tipo: tipo Enum Tipo, consultable y NO modificable
 * estaServido: tipo booleano, consultable y modificable solo a partir del método servir
 *
 * PROPIEDADES DERIVADAS: ninguna
 *
 * PROPIEDADES COMPARTIDAS: ninguna
 *
 * RESTRICCIONES: ninguna
 *
 * METODOS ANHIADIDOS:
 * Gets de las propiedades consultables
 * void servir()
 * String toString
 *
 * HERENCIA: Clase PADRE de las clases Panini y Pizza
 *
 * */

public class ComidaItaliana {
    //TODO ver como haría esta clase abstracta y poner abstracto el método toString, que sería
    //TODO el unico que nos interesaría sobreescribir, se puede? puedo dejar métodos abstractos?

    //Atributos
    private Tipo tipo;
    private boolean estaServida;

    //TODO hacer ctes de String

    //Metodos

    //Constructor
    public ComidaItaliana(Tipo tipo) {
        this.tipo = tipo;
//      this.estaServida = false, no hace falta ya que por defecto es falso
    }

    //Geters
    private Tipo getTipo() {
        return tipo;
    }

    public boolean isEstaServida() {
        return estaServida;
    }

    //Método cuyo proposito es pasar el atributo estaServida a true
    public void servir() {
        this.estaServida = true;
    }

    //ToString que usan las clases hijas
    @Override
    public String toString() {
        return "\ntipo: " + getTipo() +
                "\nestaServida: " + isEstaServida();
    }
}
