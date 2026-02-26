package Inheritance;

public class Person {
    String firstName;
    String lastName;
    String gender;

    public String getFirstName(String firstName) {
        return this.firstName;
    }
    public String getLastName(String lastName) {
        return this.lastName;
    }
    public String getGender(String gender) {
        return this.gender;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public boolean equals(Person p) {
        if (p == null) {
            return false;
        }

        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(p.gender);
    }
}
