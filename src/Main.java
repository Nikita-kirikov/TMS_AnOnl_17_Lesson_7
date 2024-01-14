import task1.Phone;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(2342323, "Samsung", 178);
        Phone phone2 = new Phone(23454312, "Apple", 198);
        Phone phone3 = new Phone(45084762, "Xiaomi", 211);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        phone1.receiveCall("Alla");
        phone2.receiveCall("Vadim");
        phone3.receiveCall("Vlad");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Anna", 234584);
        phone1.receiveCall("Dasha", 405857332);
        phone1.receiveCall("Egor", 394857);

        phone1.sendMessage(1,3,4,3,2,3,54,23);

    }
}