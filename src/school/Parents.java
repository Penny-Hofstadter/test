package school;

import interfaces.school.BasePerson;
import interfaces.school.Student;

public final class Parents extends BasePerson {

    private  long phoneNumber;
    private interfaces.school.Student student;
    public Parents(String firstName, String lastName, char gender, int age, String status, long phoneNumber,
                   interfaces.school.Student student) {
        super(firstName, lastName, gender, age, status);
        this.phoneNumber = phoneNumber;
        this.student = student;

    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void  printParent() {
        System.out.println();
        System.out.println(
                getFirstName() +" " + getLastName() + ", is parent of student  " + student.getFirstName() + " " +
                        student.getLastName() +" " + student.getGrade() + " grade");
        System.out.println("Parent phone number: " + getPhoneNumber());
    }

    @Override
    public void setAge(int age) {

    }

    public Student getStudent() {
        return student;
    }
}
