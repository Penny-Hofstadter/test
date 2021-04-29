package school;

import interfaces.school.BasePerson;

public abstract class BaseAdministrator extends BasePerson {

    public BaseAdministrator(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }

    @Override
    public void setAge(int age) {

    }
}
