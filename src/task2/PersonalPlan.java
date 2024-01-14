package task2;

public class PersonalPlan {
    Doctor dr1 = new Doctor("Хирург", "Зашивает");
    Doctor dr2 = new Doctor("Дантист", "Осматривает зубы");
    Doctor dr3 = new Doctor("Терапевт", "Слушает");

    public void chooseADoctor(int code) {
        switch (code) {
            case 1:
                dr1.heal();
                break;
            case 2:
                dr2.heal();
                break;
            default:
                dr3.heal();
                break;
        }
    }
}
