package Ej2.Menu;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    private static Scanner tec = new Scanner (System.in);

    //Muestra mensaje y pide que ingreses un valor, luego, lo valida y devuelve el mismo validado
    public static LocalDate ingresarFechaInicial(){
        String fechaCadena;
        Mensajes.displayFechaInicial();
        fechaCadena=tec.nextLine();
        //TODO metodo en la clase Validaciones que valide el formato de la fecha o con try-catch
        LocalDate fecha = LocalDate.parse(fechaCadena);
        return fecha;
    }

    //Muestra mensaje y pide que ingreses un valor, luego, lo valida y devuelve el mismo validado
    public static LocalDate ingresarFechaFinal(LocalDate fechaInicio){
        String fechaCadena;
        Mensajes.displayFechaFinal();
        fechaCadena=tec.nextLine();
        //TODO metodo en la clase Validaciones que valide el formato de la fecha o con try-catch,
        //TODO tambien mirar que la fecha de inicio sea menor a la final
        LocalDate fecha = LocalDate.parse(fechaCadena);
        return fecha;
    }

    //Muestra un mensaje con el tiempo restante entre las 2 fechas ingresadas como parámetros
    public static void mostrarTiempoDias(LocalDate fechaInicio, LocalDate fechaExpulsion) {
        Mensajes.displayMensajeTiempoRestante();
        Mensajes.displayDiasRestantes(fechaInicio,fechaExpulsion);
    }
}
