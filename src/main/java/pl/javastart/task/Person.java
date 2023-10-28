package pl.javastart.task;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        if (firstName == null) {
            return "Brak";
        } else {
            return firstName;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        if (lastName == null) {
            return "Brak";
        } else {
            return lastName;
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
