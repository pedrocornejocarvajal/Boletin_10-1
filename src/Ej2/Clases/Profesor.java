package Ej2.Clases;

/*                              INTERFAZ PROFESOR
 *
 * PROPIEDADES BÁSICAS:
 * nombre: tipo String, consultable y NO modificable
 * apellidos: tipo String, consultable y NO modificable
 * edad: tipo int, consultable y NO modificable
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
 * HERENCIA: Clase PADRE de las clases Fijo y Interino
 *
 * */
public class Profesor {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;

    //Metodos

    //Constructor
    public Profesor(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Gets
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    //ToString que usarán las clases hijas
    @Override
    public String toString() {
        return "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                '}';
    }

}
