package exam;

/**
 * Nacitaní dat ze souboru.
 */
public class DataLoad {

    static void loadPatients(String path) {
        // TODO: nacist pacienty ze souboru
    }

    static void cleanMeasurements(String directoryPath){
        // TODO: vytvorit cleanMeasurements.txt
    }


    static void loadMeasurements(String path) {
        // TODO: načíst měření
    }

    static void init() {

        // TODO: Spusteni nacteni:

        loadPatients("data/patients.txt");
        //cleanMeasurements("data")
        loadMeasurements("cleanMeasurements.csv");
        System.out.println("Nacteno pacientu: " + Run.patients.size());
        System.out.println("Nacteno mereni: " + Run.measurements.size());
    }
}
