package task2;

public class Patient {
    private int age;
    private int code;

    public Patient(int age) {
        this.age = age;
    }

    public void assignAPlan() {
        if(getAge() < 20 ) {
            setCode(1);
        } else if(getAge() > 20 && getAge() < 40) {
            setCode(2);
        } else if(getAge() > 40){
            setCode(0);
        }
    }

    public int getAge() {
        return age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
