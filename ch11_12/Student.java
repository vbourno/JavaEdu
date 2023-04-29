package gr.aueb.cf.ch11_12;

/**
 * Student class definition
 * POJO class (Plain Old Java Object)
 * Javabean
 */
public class Student {
    private int id;
    private String fisrstname;
    private String lastname;

    //Με δεξί κλικ - generate εισάγεται default Constructor, Overloaded Cosntructor, getters και setters

    //Default Constructor
    public Student() {
        id = 0;                 //Αρχικοποιούνται αυτόματα, μπορούμε να μην τα γράψουμε
        fisrstname = null;      //Επίσης, ο Constructor παρέχεται αυτόματα από την Java
        lastname = null;
    }

    //Overloaded Constructor
    public Student(int id, String fisrstname, String lastname) {
        this.id = id;
        this.fisrstname = fisrstname;
        this.lastname = lastname;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFisrstname() { return fisrstname; }

    public void setFisrstname(String fisrstname) { this.fisrstname = fisrstname; }

    public String getLastname() { return lastname; }

    public void setLastname(String lastname) { this.lastname = lastname; }
}
