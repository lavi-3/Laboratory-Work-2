public class PastryChef {
    private String name;
    private String surname;
    private int age;

    public PastryChef(String name, String surname, int age) {
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

    public String cookDesserts() {
        return "Pastry chef: I make the desserts";
    }

    public String cookPies() {
        return "Pastry chef: I make the pies";
    }
}
