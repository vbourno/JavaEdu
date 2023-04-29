package gr.aueb.cf.ch17.clona;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");

        City clonedAthens = (City) athens.clone();

        clonedAthens.setDescription("Athens2022");

        System.out.println(athens);
        System.out.println(clonedAthens);

        Trainee alice = new Trainee("Alice", new City("Athens"));
        Trainee clonedTrainee = alice.clone();
        clonedTrainee.setCity(new City("Athens2"));

        System.out.println(alice);
        System.out.println(clonedTrainee);

        Trainee bob = new Trainee(alice);
        bob.getCity().setDescription("London");
        System.out.println(alice);
        System.out.println(bob);
    }
}
