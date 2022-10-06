public class Chef {
    private String name;
    private String surname;
    private int age;

    public Chef(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Dishwasher hireDishwasher() {
        return new Dishwasher(name, surname, age);
    }

    public SousChef hireSousChef() {
        return new SousChef(name, surname, age);
    }

    public PastryChef hirePastryChef() {
        return new PastryChef(name, surname, age);
    }

    public LineCooks hireLineCooks() {
        return new LineCooks(name, surname, age);
    }

    public String composeMenu() {
        return "Chef: Menu ready and improved!";
    }

    public static boolean tastes() {
        if(Math.random() > 0.5) {
            System.out.println("Chef: Delicious!");
            return true;
        } else {
            System.out.println("Chef: Redo it!");
            return false;
        }
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
