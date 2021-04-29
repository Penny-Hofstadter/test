package school;

import interfaces.school.BasePerson;
import interfaces.school.Parents;

public final class Student extends BasePerson {

    private final int grade;

    public Student(String firstName, String lastName, char gender, int age, String status, int grade) {
        super(firstName, lastName, gender, age, status);
        this.grade = grade;
    }


    @Override
    public void setAge(int age) {

    }

    public int getGrade() {
        return grade;
    }
    public void printParent (interfaces.school.Parents[] parents){
        for (Parents parent:
             parents) {
            if (parent.getStudent().equals(this)) {
                System.out.println();
                System.out.println(
                        "Student: " + getFirstName() + " " + getLastName());
                System.out.println("Parent: " + parent.getFirstName() + " " + parent.getLastName());
            }
        }
    }
}
