public class LineCooks {
    private String name;
    private String surname;
    private int age;

    public LineCooks(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String cook() {
        return "Line cook: I'm cooking";
    }

    public String clean() {
        return "Line cook: I'm cleaning my workspace";
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
