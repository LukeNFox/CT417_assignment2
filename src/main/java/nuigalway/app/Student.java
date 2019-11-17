package nuigalway.app;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private LocalDate dob;
    private int id;
    private String username;
    private CourseProgramme course;
    private ArrayList<Module> modules;

    static int ids = 0;

    public Student(String name, LocalDate dob){
        this.name = name;
        this.dob = dob;
        this.id = ids++;
        setAge();


    }

    public String getUsername(){
        this.username = name + age;
        return username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(){
        this.age = Years.yearsBetween(dob, new LocalDate()).getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
        setAge();
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public void setCourse(CourseProgramme course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        this.modules.add(module);
    }
}

