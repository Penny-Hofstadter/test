package school;

import interfaces.school.BaseAdministrator;

public class Counselor extends BaseAdministrator {


    public Counselor(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }
}
