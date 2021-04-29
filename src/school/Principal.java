package school;

import interfaces.school.BaseAdministrator;

public class Principal extends BaseAdministrator {

    public Principal(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }
}

