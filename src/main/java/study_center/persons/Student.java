package study_center.persons;
import study_center.Program;

public class Student extends Person {
    private Program studentProgram;

    public Student(String personName, String personSurname) {
        super(personName, personSurname);
    }

    public Program getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(Program studentProgram) {
        this.studentProgram = studentProgram;
    }
}
