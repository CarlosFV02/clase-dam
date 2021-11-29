

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClaseDamTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClaseDamTest
{
    private ClaseDam claseDam1;
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;

    /**
     * Default constructor for test class ClaseDamTest
     */
    public ClaseDamTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        claseDam1 = new ClaseDam(15);
        alumno1 = new Alumno("Carlos", "1234", 18);
        alumno2 = new Alumno("Myrian", "2222", 26);
        alumno3 = new Alumno("Andrea", "3333", 30);
        alumno4 = new Alumno("Sergio", "4444", 24);
        alumno5 = new Alumno("Youseff", "5555", 20);
        claseDam1.matricularAlumno(alumno1);
        claseDam1.matricularAlumno(alumno2);
        claseDam1.matricularAlumno(alumno3);
        claseDam1.matricularAlumno(alumno4);
        claseDam1.matricularAlumno(alumno5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
