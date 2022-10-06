public class MaitredHotel {
    private String name;
    private String surname;
    private int age;

    public MaitredHotel(String name, String surname, int age) {
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

    public String greetClients() {
        return "Maitre d'Hotel: I greet clients";
    }

    public String takeOrders() {
        return "Maitre d'Hotel: I take orders";
    }

    public String reservations() {
        return "Maitre d'Hotel: I make reservations";
    }

    public Waiters hireWaiters (String name, String surname, int age) {
        return new Waiters(name, surname, age);
    }

    public DeliveryGuy hireDeliveryGuy (String name, String surname, int age) {
        return new DeliveryGuy(name, surname, age);
    }

    public Barman hireBarman (String name, String surname, int age) {
        return new Barman(name, surname, age);
    }

    public Maid hireMaid (String name, String surname, int age) {
        return new Maid(name, surname, age);
    }



}
