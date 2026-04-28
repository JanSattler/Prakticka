package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hlavni trida aplikace (Hub).
 */
public class Run {

    // Globalni kolekce
    public static ArrayList<Patient> patients = new ArrayList<>();
    public static ArrayList<Measurement> measurements = new ArrayList<>();

    //Promena pro vlakno - inicializujte jednou, at ho nemusite prepisovat
    public static LogThread logThread = new LogThread();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nactu data:
        DataLoad.init();

        //ruzne moznosti:
//        exam.PatientTest.init();
//        exam.PatientGui.init();
//        exam.MonitoringServices.init();
//        toggleLogging();

    }


    private static void printMenu() {
        System.out.println("1 - OOP otestovani implementace");
        System.out.println("2 - GUI");
        System.out.println("3 - Statistiky");
        System.out.println("4 - Thread");
        System.out.println("5 - Konec");
        System.out.print("> ");
    }

    private static void toggleLogging() {
        // TODO: spustit / zastavit vlakno (zastavit muzete treba pomoci interrupt(), pozor)
    }
}
