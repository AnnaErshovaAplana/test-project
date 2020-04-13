package study_center;

import study_center.persons.Student;
import study_center.reports.LongReport;
import study_center.reports.Report;
import study_center.reports.ShortReport;

import java.util.Arrays;

public class StudyCenter {
    public static void main(String[] args) {
        Student Ivan = new Student("Ivan", "Ivanov");
        Course javaCourse = new Course("Java" , 50);
        Course javaScriptCourse = new Course("Java Script" , 16);
        Program codingProgram = new Program("08/03/2010 10:00", "Coding");
        // заполняем курсами программу
        Course[] courses = new Course[] {javaCourse, javaScriptCourse};
        codingProgram.addCoursesToProgram(courses);
        // доавляем программу студенту
        Ivan.setStudentProgram(codingProgram);
        codingProgram.calculaterogramEndDate();
        System.out.println("------------Short report------------\n");
        Report shortReport = new ShortReport();
        shortReport.showReportForStudent(Ivan);
        System.out.println("------------Full report------------\n");
        Report longReport = new LongReport();
        longReport.showReportForStudent(Ivan);
    }
}
