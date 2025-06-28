import org.junit.Test;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Test
    public void testVerifyAdd() {
        Calculator mockCalc = mock(Calculator.class);

        // Simulate calls
        mockCalc.add(1, 2);
        mockCalc.add(1, 2);
        mockCalc.clear();

        // ✅ Verifications
        verify(mockCalc, times(2)).add(1, 2); // called 2 times
        verify(mockCalc, never()).add(3, 4);  // never called
        verify(mockCalc).clear();             // called once
    }
}
