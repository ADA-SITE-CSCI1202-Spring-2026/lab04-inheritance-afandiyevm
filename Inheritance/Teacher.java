package Inheritance;

public class Teacher extends Person {
    String department;
    String courses;

    public String getDepartment(String department) {
        return this.department;
    }
    
    public String getCourses(String courses) {
        return this.courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void setCourses(String courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", courses='" + courses + '\'' +
                '}';
    }
    public boolean equals(Teacher p) {
        if (p == null) {
            return false;
        }

        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(p.gender) && this.department.equals(p.department) && this.courses.equals(p.courses);
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("John");
        teacher1.setLastName("Doe");
        teacher1.setGender("Male");
        teacher1.setDepartment("Test");
        teacher1.setCourses("Course1");

        Teacher teacher2 = new Teacher();
        teacher2.setFirstName("John");
        teacher2.setLastName("Doe");
        teacher2.setGender("Male");
        teacher2.setDepartment("Test");
        teacher2.setCourses("Course2");

        System.out.println(teacher1.equals(teacher2));
    }
}
