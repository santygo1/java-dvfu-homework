package lab9_10;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Danil on 28.11.2022
 * @project DVFUHomework
 */
public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = -3371951789447824782L;
    private String firstName;
    private String secondName;
    private String address;
    private int birthdayYear;

    public Person(String firstName, String secondName, String address, int birthdayYear) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.birthdayYear = birthdayYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    @Override
    public String toString() {
        return "Person{"
                + "First Name: " + firstName + ", "
                + "Second Name: " + secondName + ", "
                + "Address: " + address + ", "
                + "Birthday Year: " + birthdayYear
                +"}";
    }
}
