import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void mockTest() {
        App mockApp = mock(App.class);
        when(mockApp.add(1, 2)).thenReturn(10);
        assertEquals(10, mockApp.add(1, 2));
    }
}
