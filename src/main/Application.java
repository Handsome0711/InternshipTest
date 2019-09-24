package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));
        university.averageScore();

        Internship internship = new Internship("Interlink");

        for(Student student : university.getUniversityStudents()) {
            internship.setStudent(student);
        }

        System.out.println("List of internship's students:");
        internship.getStudents();
    }
}
