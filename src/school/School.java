package school;

import interfaces.school.Parents;
import interfaces.school.Student;
import interfaces.school.Teacher;

import static interfaces.school.Data.FOR_TC_PER_WEEK;
import static interfaces.school.tests.Assert.*;

public class School {
    private static final double EXPECTED_BASE_SALARY = 1440;
    public static void main(String[] args) {




        interfaces.school.Student student1 = new interfaces.school.Student("Masha",
                "Ivanova",
                '1',
                10,
                "Student",
                5);
        interfaces.school.Student student2 =new Student("Vova",
                "Ivanov",
                'M',
                14,
                "Student",
                7);
        interfaces.school.Parents parent1 = new interfaces.school.Parents("Petr",
                "Ivanov",
                'M',
                45,
                "Parent",
                1111111111,
                student1);
        interfaces.school.Parents parent2 = new interfaces.school.Parents("Elena",
                "Ivanova",
                'F',
                40,
                "Parent",
                1234567890,
                student1);
        interfaces.school.Parents parents3 = new interfaces.school.Parents("Andrey",
                "Sidorov",
                'M',
                35,
                "Parent",
                1234567890,
                student2);
        interfaces.school.Teacher teacher1 = new Teacher("Maria Ivanovna",
                "Petrova",
                'F',
                35,
                "Teacher",
                "Russian Literature", 2, FOR_TC_PER_WEEK);


        interfaces.school.Parents[] parents = new Parents[]{parent1, parent2};

        aAssert(EXPECTED_BASE_SALARY, teacher1.getBaseSalary());

    }

}