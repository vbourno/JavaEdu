package gr.aueb.cf.ch15.seminars.model;

import java.util.Date;

public class TimePeriod extends IdentifiableEdinty {
    private Date start;
    private Date end;

    public TimePeriod() {
    }

    public Date getStart() {
        return new Date(this.start.getTime());
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return new Date(this.end.getTime());
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
