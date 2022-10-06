public class Waiters {
    private String name;
    private String surname;
    private int age;

    public Waiters(String name, String surname, int age) {
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

    public String takeOrder() {
        return "Waiter: I'm taking orders";
    }

    public String serveFood() {
        return "Waiter: I'm serving food";
    }

    public String cleanTable() {
        return "Waiter: I'm cleaning table";
    }

    public String takePayment() {
        return "Waiter: I'm taking payment";
    }


}
