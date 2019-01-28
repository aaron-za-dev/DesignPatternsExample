package DAO;

public class User {

    private int UserID;
    private String Name;
    private String password;

    public User(int userID, String name, String password) {
        UserID = userID;
        Name = name;
        this.password = password;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
