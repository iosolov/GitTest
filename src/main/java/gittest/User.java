package gittest;

public class User extends Example {

    private String fName;
    private String lName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() + '\'' +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}

