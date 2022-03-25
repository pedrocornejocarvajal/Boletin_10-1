package Ej2.Clases;

import Ej2.Enums.CargosFijos;

import java.time.LocalDate;

/*                              INTERFAZ FIJO
 * PROPIEDADES BÁSICAS:
 * cargo: tipo CargosInterinos, consultable y modificable a partir del métodos intercambiarCargo
 * fechaContrato: tipo LocalDate, consultable y NO modificable
 *
 * PROPIEDADES DERIVADAS: ninguna
 *
 * PROPIEDADES COMPARTIDAS:
 * ID: tipo int, consultable y NO modificable
 *
 * RESTRICCIONES: ninguna
 *
 * METODOS ANHIADIDOS:
 * Gets de las propiedades consultables
 * String toString
 * void intercambiarCargos(Fijo profesorFijo)
 *
 * HERENCIA: Clase HIJA de las clase Profesor
 *
 * */
public class Fijo extends Profesor{
     //Atributos
    private static int ID;
    private CargosFijos cargo;
    private LocalDate  fechaContrato;

    //Métodos

    //Constructor
    //TODO metodo para validar edad y el String que representa la fechaContrato
    public Fijo(String nombre, String apellidos, int edad, CargosFijos cargo, String fechaContrato) {
        super(nombre, apellidos, edad);
        this.cargo=cargo;
        this.fechaContrato=LocalDate.parse(fechaContrato);
        ID++;
    }

    //Gets y Sets
    public static int getID() {
        return ID;
    }

    public CargosFijos getCargo() {
        return cargo;
    }

    public void setCargo(CargosFijos cargo) {
        this.cargo = cargo;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    //ToString que también usa el de la clase padre
    @Override
    public String toString() {
        return "Fijo{" +
                "ID: "+ ID +
                super.toString() +
                "cargo: " + cargo +
                ", fechaContrato: " + fechaContrato +
                '}';
    }

    /*
    * Precondiciones: profesorFijo debe estar instanciado
    * Postcondiciones: usa un objeto tipo CargosFijos de forma auxiliar para intercambiar los
    * cargos de el que llama al método por el objeto tipo Fijo que sea pasado como parámetro
    * Entrada: ninguna
    * Salida: ninguna
    * */
    public void intercambiarCargo(Fijo profesorFijo){
        CargosFijos cargoAux;
        cargoAux=getCargo();
        setCargo(profesorFijo.getCargo());
        profesorFijo.setCargo(cargoAux);
    }
}
