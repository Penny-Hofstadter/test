package school;

import interfaces.school.BasePerson;

public abstract class BaseEmployee extends BasePerson {
    private double salary;

    public BaseEmployee(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);

    }
    public abstract double getSalary();
    public abstract double getTaxes();

}
