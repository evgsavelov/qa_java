import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertThrows;

public class LionExceptionTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @Mock
    Feline feline;
    @Test
    public void lionThrowsExceptionTest() {
        Exception actualException = assertThrows(Exception.class, () -> new Lion("qwerty", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", actualException.getMessage());
    }
}
