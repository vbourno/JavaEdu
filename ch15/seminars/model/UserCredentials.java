package gr.aueb.cf.ch15.seminars.model;

public class UserCredentials extends IdentifiableEdinty{
    private String username;
    private String password;

    public UserCredentials() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
