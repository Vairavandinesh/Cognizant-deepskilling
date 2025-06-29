import org.junit.Test;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Test
    public void testVerifyAdd() {
        Calculator mockCalc = mock(Calculator.class);

        
        mockCalc.add(1, 2);
        mockCalc.add(1, 2);
        mockCalc.clear();

        
        verify(mockCalc, times(2)).add(1, 2); 
        verify(mockCalc, never()).add(3, 4);  
        verify(mockCalc).clear();            
    }
}
