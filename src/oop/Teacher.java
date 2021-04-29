package oop;

import java.util.IllegalFormatCodePointException;

import static oop.Utils.*;

public class Teacher extends Person {

    private String subject;

    Teacher(boolean isStudent, String firstName, String lastName, int age,String subject){
        super(isStudent, firstName, lastName, age);
        this.setSubject(subject);
    }
    public void setSubject(String subject) {
        if (getPerson().equals("Teacher")) {
            this.subject =  subject;
        } else {
            this.subject = null;
        }
    }
    public void printTeacherCard() {
        printCard();
        System.out.println(subject);
        printLine();
    }









//
//    Teacher(String firstName, String lastName, int age, boolean isTeacher, String subject) {
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setAge(age);
//        this.setIsTeacher(isTeacher);
//        this.setSubject(subject);
//
//
//    }
//
//
//    public String getFirstName() {
//
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
//    public boolean getIsTeacher() {
//        return isTeacher;
//    }
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setFirstName(String firstName) {
//        if (firstName != "") {
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
//    }
//
//    public void setAge(int age) {
//        if (age >= 21 && age < 65) {
//            this.age = age;
//            this.isTeacher = true;
//
//        } else {
//            System.out.println("Not eligible age.");
//            this.age = 0;
//
//        }
//    }
//    public void setIsTeacher(boolean isTeacher) {
//        if (age == 0) {
//            this.isTeacher = false;
//        } else {
//            this.isTeacher = isTeacher;
//        }
//    }
//
//    public void setSubject(String subject) {
//        if (isTeacher == false) {
//            this.subject =  null;
//        } else {
//            this.subject = subject;
//        }
//        //this.subject = subject;
//    }
//
//    public void printCard(String firstName, String lastName, int age,  boolean isTeacher, String subject) {
//        System.out.println("_________________________________________");
//        if (isTeacher) {
//            System.out.println("Teacher");
//        }
//        System.out.println(firstName + " " + lastName + " " + age + " ");
//        System.out.println(subject);
//    }



}
