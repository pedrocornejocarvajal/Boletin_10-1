package Ej2.Menu;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mensajes {
    public static final String FECHA_INICIAL="Ingresa una nueva fecha de inicio de interinidad en el formato YYYY-MM-DD, ej. '2020-05-20'";

    public static final String FECHA_FINAL="Ingresa una nueva fecha final de interinidad en el formato YYYY-MM-DD, ej. '2020-05-20'";

    public static final String TIEMPO_RESTANTE_DIAS="El tiempo restante en días es de";
    public static void displayFechaInicial(){
        System.out.println(FECHA_INICIAL);
    }

    public static void displayFechaFinal(){
        System.out.println(FECHA_FINAL);
    }

    public static void displayMensajeTiempoRestante() {
        System.out.println(TIEMPO_RESTANTE_DIAS);
    }

    public static void displayDiasRestantes(LocalDate fechaInicio, LocalDate fechaExpulsion) {
        System.out.println(ChronoUnit.DAYS.between(fechaInicio, fechaExpulsion));
    }
}
