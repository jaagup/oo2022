import java.util.*;

public class Person {
    String fName;
    String lName;
    String mName = "";
    String birthDay;

    public Person(String fName, String lName, String mName, String birthDay) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
        this.birthDay = birthDay;
    }

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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
