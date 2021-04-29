package oop;

public class Student extends Person {


        private int grade;

        Student(boolean isStudent, String firstName, String lastName, int age, int grade){
            super(isStudent, firstName, lastName, age);
            this.grade = grade;
        }

//
//    public Student(String firstName, String lastName, int age, boolean isStudent, int grade) {
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setAge(age);
//        this.setIsStudent(isStudent);
//        this.setGrade(grade);
//
//
//    }
//
//    public void setFirstName(String firstName) {
//        if (firstName != ""){
//            this.firstName = firstName;
//        } else {
//            System.out.println("Not valid name.");
//        }
//    }
//
//    public void setLastName(String lastName) {
//        if (lastName != "") {
//            this.lastName = lastName;
//        } else {
//            System.out.println("Not valid last name.");
//        }
//
//    }
//
//    public void setAge(int age) {
//        if (age >= 5 && age <=18 ) {
//            this.age = age;
//        } else {
//            System.out.println("Not eligible age.");
//            this.age = 0;
//        }
//
//    }
//    public void setIsStudent(boolean isStudent) {
//        if (age == 0 ) {
//            this.isStudent = false;
//        } else if (isStudent = false) {
//            this.isStudent = false;
//        } else {
//            this.isStudent = true;
//        }
//    }
//
//    public void setGrade(int grade) {
//        if (isStudent) {
//            this.grade = grade;
//        } else {
//            this.grade = -1;
//        }
//    }
//
//
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//
//
//    public boolean getIsStudent() {
//        return isStudent;
//    }
//    public int getGrade() {
//        return grade;
////    }
//
//    public void printCard(String firstName, String lastName, int age,  boolean isStudent, int grade){
//        if (isStudent){
//            System.out.println("student");
//        }
//        System.out.println(firstName + " " + lastName + ", " + age);
//        System.out.println(grade + " grade");
//        System.out.println("***************************************************************************");
//    }
}
