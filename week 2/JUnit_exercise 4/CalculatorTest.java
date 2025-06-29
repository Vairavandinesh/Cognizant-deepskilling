import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calc;

    
    @BeforeEach
    public void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator(); 
    }

   
    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    public void testAddition() {
        
        int a = 2, b = 3;

        
        int result = calc.add(a, b);

        
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        
        int a = 7, b = 4;

       
        int result = calc.subtract(a, b);

        
        assertEquals(3, result);
    }
}
