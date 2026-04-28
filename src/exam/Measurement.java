package exam;

/**
 * Trida pro jedno mereni u pacienta
 */
public class Measurement {
    String patientId;
    /** Kolik minut u nas pacient je v dobe mereni */
    int minute;
    /** Okysliceni - procentualni hodnota */
    double oxygen;
    /** Srdecni tep */
    int bpm;
    int systolic; // ...krevni tlak...
    int diastolic;//...ten, ktery ma byt nizsi

    public Measurement(String patientId, int minute, double oxygen, int bpm, int systolic, int diastolic) {
        this.patientId = patientId;
        this.minute = minute;
        this.oxygen = oxygen;
        this.bpm = bpm;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }
}





