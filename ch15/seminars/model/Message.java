package gr.aueb.cf.ch15.seminars.model;

public class Message extends IdentifiableEdinty {
    private String title;
    private String body;

    public Message() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
