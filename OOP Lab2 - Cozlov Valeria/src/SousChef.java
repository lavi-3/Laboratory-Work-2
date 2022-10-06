public class SousChef {
    private String name;
    private String surname;
    private int age;

    public SousChef(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String designsDishes() {
        return "Sous Chef: I design dishes";
    }

    public String supervisesLineCooks() {
        return "Sous Chef: I supervise line cooks";
    }

    public String supervisesDishwashers() {
        return "Sous Chef: I supervise dishwashers";
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
