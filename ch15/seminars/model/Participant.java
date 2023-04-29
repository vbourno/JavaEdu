package gr.aueb.cf.ch15.seminars.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Participant extends User {
    private List<Seminar> seminars = new ArrayList<>();
    private List<SeminarResponce> seminarResponces  = new ArrayList<>();

    public Participant() {
    }

    List<Seminar> getSeminars() {
        return seminars;
    }

    public List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars);
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }

    List<SeminarResponce> getSeminarResponces() {
        return seminarResponces;
    }

    public List<SeminarResponce> getAllSeminarResponces() {
        return Collections.unmodifiableList(this.seminarResponces);
    }

    public void setSeminarResponces(List<SeminarResponce> seminarResponces) {
        this.seminarResponces = seminarResponces;
    }

    public boolean addSeminar(Seminar seminar) {
        if (seminar == null) return false;
        for (Participant participant : seminar.getParticipants()) {
            if (participant == this) {
                return false;
            }
        }
        this.seminars.add(seminar);
        seminar.getParticipants().add(this);
        return true;
    }

    public boolean addSeminarResponce(SeminarResponce seminarResponce) {
        if (seminarResponce == null) return false;
        if (seminarResponce.getSender() == this) return false;

        this.seminarResponces.add(seminarResponce);
        seminarResponce.setSender(this);
        return true;
    }
}
