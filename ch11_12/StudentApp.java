package gr.aueb.cf.ch11_12;

public class StudentApp {

    public static void main(String[] args) {
        Student alice = new Student(); //όπου Student είναι Constructor
        Student bob = new Student(2, "Bob", "Dylan"); //with overloaded Constructor

        alice.setId(1);
        alice.setFisrstname("Alice");
        alice.setLastname("W.");

        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFisrstname());
        System.out.println("Lastname: " + alice.getLastname());

        System.out.println("ID: " + bob.getId());
        System.out.println("Firstname: " + bob.getFisrstname());
        System.out.println("Lastname: " + bob.getLastname());
    }
}
