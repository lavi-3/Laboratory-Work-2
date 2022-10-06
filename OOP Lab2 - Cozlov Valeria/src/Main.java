public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", "Smith", 25);
        Chef chef = manager.hireChef("Romeo", "Rossi", 17);
        Accountant accountant = manager.hireAccountant("Robert", "Miller", 6);
        MaitredHotel maitredHotel = manager.hireMaitredHotel("Anne", "Johnson", 9);
        Waiters waiters = maitredHotel.hireWaiters("Billy", "Davis", 3);
        DeliveryGuy deliveryGuy = maitredHotel.hireDeliveryGuy("Guy", "Denvers", 2);
        Barman barman = maitredHotel.hireBarman("Oliver", "Brown", 8);
        Maid maid = maitredHotel.hireMaid("Anne", "Johnson", 1);
        LineCooks lineCooks = chef.hireLineCooks();
        SousChef sousChef = chef.hireSousChef();
        PastryChef pastryChef = chef.hirePastryChef();
        Dishwasher dishwasher = chef.hireDishwasher();



        System.out.println("The manager of this restaurant is " + manager.getName() + " " + manager.getSurname() + " and he has " + manager.getAge() + " years of experience.");
        System.out.println("The chef of this restaurant is " + chef.getName() + " " + chef.getSurname() + " and he has " + chef.getAge() + " years of experience.");
        System.out.println("The accountant of this restaurant is " + accountant.getName() + " " + accountant.getSurname() + " and he has " + accountant.getAge() + " years of experience.");
        System.out.println("The maitre d'Hotel of this restaurant is " + maitredHotel.getName() + " " + maitredHotel.getSurname() + " and he has " + maitredHotel.getAge() + " years of experience.");
        System.out.println("The Maitre d'Hotel hired a new waiter, " + waiters.getName() + " " + waiters.getSurname() + " and he has " + waiters.getAge() + " years of experience.");

        System.out.println(chef.composeMenu());
        System.out.println(accountant.calculateSalary());
        System.out.println(maitredHotel.greetClients());
        System.out.println(waiters.takeOrder());
        System.out.println(Chef.tastes());
        System.out.println(lineCooks.cook());
        System.out.println(sousChef.designsDishes());
        System.out.println(pastryChef.cookPies());


    }

}