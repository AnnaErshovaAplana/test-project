package study_center.reports;

import study_center.Program;
import study_center.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LongReport implements Report {
    SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy HH:mm"); //месяц буквами
    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);// чтобы правильно определять полученную дату в определенном фоормате. Если формат входной даты будет неверным, получим исключение
        Program program = currentStudent.getStudentProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programStopDate = program.getProgramEndDate();
        //используем вместо конкатенации строки потому что при конкатенации при + кажды раз выделяется новое местов памяти, а через билдер не выделяется
        StringBuilder longInfo = new StringBuilder();
        longInfo.append("STUDENT: " + currentStudent.getPersonName() + " " + currentStudent.getPersonSurname() + "\n");
        longInfo.append("STUDENT PROGRAM: " + program.getProgramName() + "\n");
        longInfo.append("PROGRAM START DAY: " + format.format(programStartDate) + "\n");
        longInfo.append("PROGRAM DURATION: " + program.countProgramDuration() + " hours\n");
        //проверка на наличие курсов в программе
        if (program.getCources() != null) {
            longInfo.append("PROGRAM COURSE: " + program.showProgramCourses() + "\n");
        } else {
            longInfo.append("NO assigned courses for the student\n");
        }
        System.out.println(longInfo.toString());
    }
}

