package nuigalway.app;

import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ModuleTest {

    private String name = "Software Engineering";
    private String id = "CT4317";
    private ArrayList<CourseProgramme> relatedCourses = null;
    private Module module = new Module(name,id);

    @Test
    public void testModuleCreation() {
        assertTrue(module.getName().equals(name));
        assertTrue(module.getId().equals(id));
    }

    @Test
    public void testModuleAlteration(){
        String newName = "Machine Learning";
        String newId   = "CT666";

        module.setName(newName);
        assertEquals(module.getName(),newName);
        module.setId(newId);
        assertEquals(module.getId(),newId);
    }

    @Test
    public void testStudentAddition(){
        Student student1 = new Student("Luke", new LocalDate(2005,10,4));
        Student student2 = new Student("Paddy", new LocalDate(1997,10,15));
        ArrayList<Student> students = new ArrayList();
        students.add(student1);
        students.add(student2);
        module.setStudents(students);
        assertEquals(module.getStudents(),students.toString());
    }

    @Test
    public void testCourse(){

    }
}
