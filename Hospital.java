package lab6;
class Doctor {
    void diagnose() {
        System.out.println("Doctor diagnosing...");
    }
}

class Surgeon extends Doctor {
    void performSurgery() {
        System.out.println("Surgeon performing surgery...");
    }
}

class Nurse extends Doctor {
    void assistDoctor() {
        System.out.println("Nurse assisting doctor...");
    }
}

public class Hospital {
    public static void main(String[] args) {
        // Multilevel Inheritance
        Surgeon surgeon = new Surgeon();
        surgeon.diagnose();
        surgeon.performSurgery();

        // Hierarchical Inheritance
        Nurse nurse = new Nurse();
        nurse.diagnose();
        nurse.assistDoctor();
    }
}
