import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class BusinessServiceTest {

    private DataRepository mockRepo;
    private BusinessService service;

    @BeforeEach
    public void setup() {
        mockRepo = mock(DataRepository.class); // Mocking
        service = new BusinessService(mockRepo);
    }

    @Test
    public void testFindMax() {
        // 🧪 Stubbing: tell mock what to return
        when(mockRepo.getData()).thenReturn(new int[] {5, 10, 3});

        int result = service.findMax();

        assertEquals(10, result); // ✅ Assertion
    }
}
