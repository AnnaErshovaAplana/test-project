package study_center;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Program {
    private Date programStartDate;
    private Date programEndDate;
    private String programName;
    private List<Course> cources = new ArrayList<>();
    private Calendar calendar = Calendar.getInstance(); // метод Calendar.getInstance() возвращает текущую дату
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm"); // для того, чтобы распарсить текущую дату из основного выхозова программы

    public Program(String programStartDate, String programName) { // исправили на формат String для programSratDate, потому что можем будем вводить дату с консоли
        format.setLenient(false); // чтобы правильно определять полученную дату в определенном фоормате. Если формат входной даты будет неверным, получим исключение
        try {
            this.programStartDate = format.parse(programStartDate);
        } catch (ParseException e) { // на случай если придет некорректный формат даты
            e.printStackTrace();
        }
        this.programName = programName;
    }

    public Date getProgramStartDate() {
        return programStartDate;
    }

    public String getProgramName() {
        return programName;
    }

    // setter для добавления курсов
    public void addCoursesToProgram(Course[] currentCourses) {
        for (Course course : currentCourses) {
            cources.add(course);
        }
    }

    public List<Course> getCources() {
        return cources;
    }


    // метод для просчета длительности курса в часах
    public int countProgramDuration() {
        int programDurationHours = 0;
        for (Course course : cources) {
            programDurationHours += course.getCourseDuration();
        }
        return programDurationHours;
    }
    // метод для просчитвания конечной даты programEndDate
    public void calculaterogramEndDate() {
        Calendar calendar = Calendar.getInstance();
        int programDurationHours = countProgramDuration();
        calendar.setTime(this.programStartDate);
        calendar.add(calendar.DAY_OF_MONTH, programDurationHours/8); // ПОЛНЫЕ ДНИ ДЛИТЕЛЬНОСТИ ПРОГРАММЫ добавляем к дате начала курса время длительности курса в часах, деленное на 8(раб день)
        calendar.add(calendar.HOUR_OF_DAY, programDurationHours%8); // оставшиеся часы дляиельности программы, которые не дотягивают до полного дня
        Date endDate = calendar.getTime(); //запрашиваем то время, которое посчитали в setTime и add
        programEndDate = endDate;
    }

    public Date getProgramEndDate() {
        return programEndDate;
    }

    public String showProgramProgress(Date startTime, Date endTime) {
        Date currentDate = calendar.getTime(); // вычисляем текущую дату
        if (currentDate.before(startTime)) {
            return "Program has not started yet\n";
        } else  if (currentDate.after(endTime)) {
            return "Program is finished\n";
        } else {
            return "Program is in progress\n";
        }
    }

    // метод, который возвращает курсы программы
    public String showProgramCourses() {
        String coursesLine = "";
        for (Course course : cources) {
            coursesLine += "Course: " + course.getCourseName() + " Duration: " + course.getCourseDuration() + " hours;\n";
        }
        return coursesLine;
    }


}
