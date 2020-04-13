package study_center.persons;

public abstract class Person {
    private  String personName;
    private String personSurname;

    public Person(String personName, String personSurname) {
        this.personName = personName;
        this.personSurname = personSurname;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }
}
