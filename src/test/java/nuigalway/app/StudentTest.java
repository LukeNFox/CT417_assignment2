package nuigalway.app;

import org.joda.time.LocalDate;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest
{

    private LocalDate dob = new LocalDate(1997,10,15);
    private int age = 22;
    private String name = "Luke";
    private String username = "Luke22";
    private Student student = new Student(name, dob);

    private String newName = "Tom";
    private String newUsername = "Tom2";
    private int newAge = 2;
    private LocalDate newDOB = new LocalDate(2017,10,15);

    private CourseProgramme course = null;
    private ArrayList<Module> module = null;

    @Test
    public void testUsername() {
        assertTrue(student.getUsername().equals(username));
    }

    @Test
    public void testAge(){
        assertTrue(student.getAge() == age);
    }

    @Test
    public void testStudentCreation(){
        assertTrue(student.getName().equals(name));
        assertTrue(student.getDob().equals(dob));
        assertTrue(student.getCourse() == null);
        assertTrue(student.getModules() == null);
    }

    @Test
    public void testStudentAlterations(){
        student.setName(newName);
        assertEquals(student.getName(),newName);
        student.setDob(newDOB);
        assertEquals(student.getAge(), newAge);
        assertEquals(student.getDob(),newDOB);
        assertEquals(student.getUsername(),newUsername);
    }

    @Test
    public void testModule(){

    }

    @Test
    public void testCourse(){


    }
}