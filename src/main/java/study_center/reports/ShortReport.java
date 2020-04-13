package study_center.reports;

import study_center.Program;
import study_center.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShortReport implements Report {
    //определяем формат даты для курса
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); //месяц цифрами
    @Override
    public void showReportForStudent(Student currentStudent) {
        format.setLenient(false);// чтобы правильно определять полученную дату в определенном фоормате. Если формат входной даты будет неверным, получим исключение
        Program program = currentStudent.getStudentProgram();
        Date programStartDate = program.getProgramStartDate();
        Date programStopDate = program.getProgramEndDate();
        //используем вместо конкатенации строки потому что при конкатенации при + кажды раз выделяется новое местов памяти, а через билдер не выделяется
        StringBuilder shortInfo = new StringBuilder();
        shortInfo.append("STUDENT: " + currentStudent.getPersonName() + " " + currentStudent.getPersonSurname() + "\n");
        shortInfo.append("STUDENT PROGRAM: " + program.getProgramName() + "\n");
        //для вывода даты старта проверим, что дата старта вообще существует
        if (program.getProgramStartDate() != null) {
            shortInfo.append("PROGRAM START DAY: " + format.format(programStartDate) + "\n");
            shortInfo.append("PROGRAM DURATION: " + program.countProgramDuration() + " hours\n");
            shortInfo.append("PROGRAM PROGRESS: " + program.showProgramProgress(programStartDate,programStopDate) + "\n");
        } else {
            shortInfo.append("NO assigned courses for the student\n");
        }
        System.out.println(shortInfo.toString());
    }
}
