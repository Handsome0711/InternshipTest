package institution.interlink;

import java.util.ArrayList;
import person.Student;

public class Internship {
    private String name;
    private final int MINSCORE = 75;
    private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        if(student.getKnowledge().getLevel() > MINSCORE && student!= null) {
            enrolledStudents.add(student);
        }
    }

    public void getStudents() {
        for(Student student : this.enrolledStudents) {
            System.out.println(student.getName());
        }
    }


}
