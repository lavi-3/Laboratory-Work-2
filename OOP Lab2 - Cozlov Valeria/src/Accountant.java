public class Accountant {
    private String name;
    private String surname;
    private int age;

    public Accountant(String name, String surname, int age) {
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

    public String calculateSalary() {
        return "Accountant: I'm calculating salary";
    }

    public String calculateTaxes() {
        return "Accountant: I'm calculating taxes";
    }

    public String calculateExpenses() {
        return "Accountant: I'm calculating profits and expenses";
    }
}
