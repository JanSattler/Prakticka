package exam;

import java.util.List;
import java.util.Map;

/**
 * Prace se streamy a statistikami.
 */
public class MonitoringServices {


    static long getMeasurementCount() {
        return 0;  //celkovy pocet mereni
    }

    static double getAverageOxygen(String department) {
        return 0; //Prumerna oxidace pacientu na oddeleni
    }

    static double pctHighPressure(){
        return 0; //vrati, kolik % mereni vykazuje vyssi tlak (Systolicky tlak vyssi 150 nebo diastolicky vyssi nez 100)
    }

    static Map<String, Long> patientsPerDepartment(){
        return null; //mapa <nazev oddeleni - pocet pacientu>
    }

    static Map<String, List<Patient>> criticalInDepartment(){
        return null; // mapa <nazev oddeleni - kriticti pacienti>
    }

    static List<Measurement> topRecent(int limit){
        return null; // list poslednich mereni (napr poslednich 10 - 10 dle nejvetsich minutes)
    }

    static void init() {
        // TODO: zde testujte vypocty
    }
}
