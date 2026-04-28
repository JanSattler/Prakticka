package exam;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    String id;
    int age;
    String department;
    List<Measurement> measurements;

    public Patient(String id, int age, String department) {
        this.id = id;
        this.age = age;
        this.department = department;

        //zacina s prazdnym seznamem procedur
        measurements = new ArrayList<>();
    }

    // TODO: implementovat rozhrani exam.Monitoring ve tride pacienta
}
interface Monitoring {

    /**
     * @return Nejnovejsi mereni pacienta
     */
    Measurement getLatestMeasurement();

    /**
     * @return skore zavaznosti, pokud nema zadna mereni, vrati 0
     */
    double getRiskScore();

    /**
     * @return true, pokud pacient ma skore zavaznosti >=5
     */
    boolean needsAttention();

    /**
     * Vypise historii pacienta.
     */
    void printMonitoringInfo();
}