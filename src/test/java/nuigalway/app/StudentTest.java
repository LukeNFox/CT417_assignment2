package nuigalway.app;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.joda.time.LocalDate;
import org.junit.Test;

public class StudentTest
{

    @Test
    public void testUsername()
    {
        Student luke = new Student("Luke", new LocalDate(1997,10,15));

        assertTrue(luke.getUsername().equals("Luke22"));
        assertFalse(luke.getUsername().equals("Luke76"));
    }



}