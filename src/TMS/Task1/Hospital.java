package TMS.Task1;

public class Hospital {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        Therapist therapist = new Therapist();
        therapist.assignDoctor(patient1);
        patient1.receiveTreatment();

        Patient patient2 = new Patient(2);
        therapist.assignDoctor(patient2);
        patient2.receiveTreatment();

        Patient patient3 = new Patient(3);
        therapist.assignDoctor(patient3);
        patient3.receiveTreatment();
    }
}
