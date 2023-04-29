package gr.aueb.cf.ch15.seminars.model;

public class SeminarResponce extends Message {
    private Participant sender;

    public SeminarResponce() {
    }

    public Participant getSender() {
        return sender;
    }

    public void setSender(Participant sender) {
        this.sender = sender;
    }
}
