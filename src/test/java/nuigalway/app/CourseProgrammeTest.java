package nuigalway.app;

import org.junit.*;
import org.joda.time.LocalDate;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CourseProgrammeTest {

    private String coursename = "Electronic and Computer Engineering";
    private String newcoursename = "Computer Science";

    private LocalDate startdate = new LocalDate(2019,8,30);
    private LocalDate enddate = new LocalDate(2020,6,25);

    private CourseProgramme course = new CourseProgramme(coursename);

    @Test
    public void testCourseCreation(){
        assertEquals(course.getCoursename(),coursename);
    }

    @Test
    public void testCourseMutation(){

        course.setCoursename(newcoursename);
        assertEquals(course.getCoursename(),newcoursename);

        course.setStartdate(startdate);
        assertEquals(course.getStartdate(),startdate);

        course.setEnddate(enddate);
        assertEquals(course.getEnddate(),enddate);

    }

    @Test
    public void testStudentMutation(){

        ArrayList<Student> students = new ArrayList<Student>();

        assertEquals(course.getStudents(),students);

        Student student1 = new Student("Luke",new LocalDate(1997,10,15));
        Student student2 = new Student("Paul",new LocalDate(1997,10,16));

        students.add(student1);
        course.setStudents(students);

        assertEquals(course.getStudents(),students);

        students.add(student2);
        course.addStudent(student2);

        assertEquals(course.getStudents(),students);
    }

    @Test
    public void testModule(){

        ArrayList<Module> modules = new ArrayList<Module>();
        Module module1 = new Module("Software engineering","CT372");
        Module module2 = new Module("Machine learning", "Ct572");

        assertEquals(course.getModules(),modules);

        modules.add(module1);
        course.setModules(modules);

        assertEquals(course.getModules(),modules);

        modules.add(module2);
        course.addModule(module2);

        assertEquals(course.getModules(),modules);
    }
}
