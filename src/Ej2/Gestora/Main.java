package Ej2.Gestora;

import Ej2.Clases.Fijo;
import Ej2.Clases.Interino;
import Ej2.Enums.CargosFijos;
import Ej2.Enums.CargosInterino;

public class Main {

    public static void main(String[] args) {
        //Instanciamos los profesores tanto fijos como interinos
        Fijo leo = new Fijo("Leopoldo", "Acal", 52, CargosFijos.JEFE_DE_DEPARTAMENTO, "2010-02-05");
        System.out.println(leo);

        Fijo raul = new Fijo("Raul", "Sanches", 36, CargosFijos.PROFESOR,"2020-08-07");
        System.out.println(raul);

        Fijo jesus = new Fijo("Jesus", "Garcia",24, CargosFijos.DIRECTOR,"2021-04-06");
        System.out.println(jesus);

        Interino miguel = new Interino("Miguel", "Casado", 54, "2015-04-06","2015-08-07", CargosInterino.JEFE_DE_DEPARTAMENTO,"IES NERVION");
        System.out.println(miguel);

        Interino rosario = new Interino("Rosario", "ManosTijeras", 58, "2020-02-03", "2020-02-08", CargosInterino.PROFESOR, "PEPITO GRILLO");
        System.out.println(rosario);

        //Intercambiamos los cargos de raul y leo, luego los mostramos por pantalla
        leo.intercambiarCargo(raul);//Raúl deberá pasar a ser jefe de departamento y leo profesor
        System.out.println(leo.getCargo());
        System.out.println(raul.getCargo());

        //Vemos el tiempo que tiene rosario como profesora y se lo cambiamos, luego volvemos a mostrarlo para ver el cambio
        rosario.verTiempoRestante();//Deberian ser 5 dias

        rosario.renovarFechas();

        rosario.verTiempoRestante();
    }

}
