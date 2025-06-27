import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calc;

    // 🔧 Setup method (Test Fixture)
    @BeforeEach
    public void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator(); // shared test fixture
    }

    // 🧹 Teardown method
    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    public void testAddition() {
        // 🅰 Arrange
        int a = 2, b = 3;

        // 🅱 Act
        int result = calc.add(a, b);

        // 🅲 Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        // 🅰 Arrange
        int a = 7, b = 4;

        // 🅱 Act
        int result = calc.subtract(a, b);

        // 🅲 Assert
        assertEquals(3, result);
    }
}
