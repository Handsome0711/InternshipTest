package institution;

import java.util.ArrayList;
import java.util.Random;

import person.Student;
import person.consciousness.Knowledge;

public class University {
    private String name;
    private ArrayList<Student> universityStudents = new ArrayList<Student>();
    Random rand = new Random();

    public University(String name) {
        //TODO: Implementation is needed
        this.name = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed

    }

    public void addStudent(Student student) {
        //TODO: Implementation is needed
        universityStudents.add(student);
    }

    public void averageScore() {
        for(Student student : this.universityStudents) {
            student.setKnowledge(new Knowledge(rand.nextInt()%100));
        }
    }
}