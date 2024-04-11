package TMS.Task1;

public class Patient {
    private int treatmentPlan;
    private Doctor assignedDoctor;

    Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    int getTreatmentPlan() {
        return treatmentPlan;
    }

    void setAssignedDoctor(Doctor doctor) {
        assignedDoctor = doctor;
    }

    void receiveTreatment() {
        assignedDoctor.treat();
    }
}
