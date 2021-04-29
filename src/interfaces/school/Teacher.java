package interfaces.school;

import static interfaces.school.Data.*;

public final class Teacher extends BaseEmployee {

    private String subject;
    private int set;
    private double code;

    public Teacher(String firstName, String lastName, char gender, int age, String status, String subject, int sets,
                   double code) {
        super(firstName, lastName, gender, age, status);
        this.subject = subject;
        this.set = sets;
        this.code = code;

    }

    @Override
    public void setAge(int age) {

    }

    public String getSubject() {
        return subject;
    }

    public void printTeacher() {
        System.out.println(
                "Teacher: " + getFirstName() + " "+getLastName() + ", subject: " + getSubject());
    }
    public double getBaseSalary(){
        return set * BASE_HOURS_SET * HOURLY_WAGE_TEACHER;

    }
    public double getSalaryPerMonth(){
        double salaryPerMonth = getBaseSalary() * 4 + FOR_TC_PER_WEEK * 4;
        return salaryPerMonth ;

    }



    @Override
    public double getTaxes() {
        return getSalaryPerMonth() * 30/100;
    }
    @Override
    public double getSalary() {
        return getSalaryPerMonth() - getTaxes();


    }
}
