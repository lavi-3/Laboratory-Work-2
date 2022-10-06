public class Manager {
    private String name;
    private String surname;
    private int age;

    public Manager(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Chef hireChef(String name, String surname, int age) {
        return new Chef(name, surname, age);
    }

    public Accountant hireAccountant(String name, String surname, int age) {
        return new Accountant(name, surname, age);
    }

    public MaitredHotel hireMaitredHotel(String name, String surname, int age) {
        return new MaitredHotel(name, surname, age);
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

}
