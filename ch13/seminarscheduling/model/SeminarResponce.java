package gr.aueb.cf.ch13.seminarscheduling.model;

public class SeminarResponce {
    private Participant sender;
    private Message message;

    public SeminarResponce() {
    }

    public Participant getSender() {
        return sender;
    }

    public void setSender(Participant sender) {
        this.sender = sender;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
