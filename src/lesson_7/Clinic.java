package lesson_7;

public class Clinic {
    public static void main(String[] args) {
        Patient patient = new Patient(1);

        Therapist therapist = new Therapist();

        therapist.assignDoctor(patient);
    }
}