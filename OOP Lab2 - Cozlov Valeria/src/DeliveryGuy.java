public class DeliveryGuy {
    private String name;
    private String surname;
    private int age;


    public DeliveryGuy(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String deliverFood() {
        return "I deliver food to clients";
    }
}
