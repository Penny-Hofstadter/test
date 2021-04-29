package practice.teacher;

public class ATeacher {
    public static void main(String[] args) {

        String firstName1 = "Maria Ivanovna", firstName2 = "Ivan Petrovich";

        String lastName1 = "Ivanova", lastName2 = "Ivanov";
        String space = " ";
        String coma = ",";
        String line = "______________________________________________";
        int age1 = 35, age2 = 55;
        String subject1 = "Russian", subject2 = "Math";

        if (firstName1 == "Maria Ivanovna") {
            System.out.println(firstName1 + space + lastName1 + coma + space + "age = " + age1 + coma + space + subject1);
        } else {
            System.out.println(firstName2 + space + lastName2 + coma + space + "age = " + age2 + coma + space + subject2);
        }
    }
}
