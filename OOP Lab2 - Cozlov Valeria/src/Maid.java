public class Maid {
    private String name;
    private String surname;
    private int age;

    public Maid(String name, String surname, int age) {
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

    public String cleanRoom() {
        return "I clean the dining room";
    }

    public String cleanToilets() {
        return "I clean the toilets";
    }
}
