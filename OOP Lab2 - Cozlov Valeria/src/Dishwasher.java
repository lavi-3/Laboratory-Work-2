public class Dishwasher {
    private String name;
    private String surname;
    private int age;

    public Dishwasher(String name, String surname, int age) {
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

    public String washDishes() {
        return "I'm washing dishes";
    }
}
