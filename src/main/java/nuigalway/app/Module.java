package nuigalway.app;

import java.util.ArrayList;

public class Module {

    private String name;
    private String id;
    private ArrayList<Student> students = new ArrayList();
    private ArrayList<CourseProgramme> relatedCourses = new ArrayList();

    public Module(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudents() {
        return students.toString();
    }

    public void setStudents(ArrayList<Student> students) {
        this.students.addAll(students);
    }

    public ArrayList<CourseProgramme> getCourses() {
        return relatedCourses;
    }

    public void addCourse(CourseProgramme course) {
            this.relatedCourses.add(course);
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.relatedCourses = courses;
    }
}
