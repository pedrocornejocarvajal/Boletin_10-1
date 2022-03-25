package Ej2.Clases;

import Ej2.Enums.CargosInterino;
import Ej2.Menu.Menu;

import java.time.LocalDate;

/*                                           INTERFAZ INTERINO
 * PROPIEDADES BÁSICAS:
 * cargo: tipo CargosInterinos, consultable y modificable a partir del métodos intercambiarCargo
 * fechaInicio: tipo LocalDate, consultable y modificable
 * fechaExpulsion: tipo LocalDate, consultable y modificable
 * instituto: tipo String, consultable y NO modificable
 *
 * PROPIEDADES DERIVADAS: ninguna
 *
 * PROPIEDADES COMPARTIDAS: ninguna
 *
 * RESTRICCIONES: ninguna
 *
 * METODOS ANHIADIDOS:
 * Gets y Sets de las propiedades consultables y modificables
 * String toString
 * void intercambiarCargos(Interino profesorInterino)
 * void renovarFechas()
 * void verTiempoRestante()
 *
 * HERENCIA: Clase HIJA de las clase Profesor
 *
 * */
public class Interino extends Profesor {

    //Atributos

    private LocalDate fechaInicio;
    private LocalDate fechaExpulsion;
    private CargosInterino cargo;
    private String instituto;

    //Metodos

    //Constructor
    public Interino(String nombre, String apellidos, int edad, String fechaInicio, String fechaExpulsion, CargosInterino cargo, String instituto) {
        super(nombre, apellidos, edad);
        this.fechaInicio=LocalDate.parse(fechaInicio);
        this.fechaExpulsion=LocalDate.parse(fechaExpulsion);
        this.cargo=cargo;
        this.instituto=instituto;
    }

    //Gets y Sets
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaExpulsion() {
        return fechaExpulsion;
    }

    public CargosInterino getCargo() {
        return cargo;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaExpulsion(LocalDate fechaExpulsion) {
        this.fechaExpulsion = fechaExpulsion;
    }

    public void setCargo(CargosInterino cargo) {
        this.cargo = cargo;
    }

    //ToString que también usa el de la clase padre
    @Override
    public String toString() {
        return "Interino{" +
                super.toString() +
                ", cargo=" + cargo +
                "fechaInicio=" + fechaInicio +
                ", fechaExpulsion=" + fechaExpulsion +
                ", instituto='" + instituto + '\'' +
                '}';
    }

    //Metodo sobrecargado
    /*
     * Precondiciones: profesorInterino debe estar instanciado
     * Postcondiciones: usa un objeto tipo CargosInterinos de forma auxiliar para intercambiar los
     * cargos de el que llama al método por el objeto tipo Interino que sea pasado como parámetro
     * Entrada: ninguna
     * Salida: ninguna
     * */
    public void intercambiarCargo(Interino profesorInterino){
        CargosInterino cargoAux;
        cargoAux=getCargo();
        setCargo(profesorInterino.getCargo());
        profesorInterino.setCargo(cargoAux);
    }

    //Ingresas desde llamadas a métodos de la clase Menú una fechaInicio y una fecha Final,
    //luego seteas estos valores en los atributos fechaInicio y fechaExpulsion
    public void renovarFechas(){
        LocalDate fechaInicio= Menu.ingresarFechaInicial();
        LocalDate fechaFinal=Menu.ingresarFechaFinal(fechaInicio);
        setFechaInicio(fechaInicio);
        setFechaExpulsion(fechaFinal);
    }

    //LLama al métodos mostrarTiemposDias de la clase Menú para mostrar
    //por pantalla la diferencia de dias que hay entre los atributos fechaInicio y fechaExpulsion
    public void verTiempoRestante(){
        Menu.mostrarTiempoDias(this.fechaInicio,this.fechaExpulsion);
    }
}
