package TMS.Task1;

public class Therapist extends Doctor {
    @Override
    void treat() {
        System.out.println("Терапевт назначает лечение");
    }

    void assignDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setAssignedDoctor(new Surgeon());
        } else if (patient.getTreatmentPlan() == 2) {
            patient.setAssignedDoctor(new Dentist());
        } else {
            patient.setAssignedDoctor(new Therapist());
        }
    }
}
