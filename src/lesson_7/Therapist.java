package lesson_7;

class Therapist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт проводит общий осмотр.");
    }

    public void assignDoctor(Patient patient) {
        switch (patient.getTreatmentPlan()) {
            case 1:
                patient.setDoctor(new Surgeon());
                break;
            case 2:
                patient.setDoctor(new Dentist());
                break;
            default:
                patient.setDoctor(this);
        }
        patient.getDoctor().treat();
    }
}
