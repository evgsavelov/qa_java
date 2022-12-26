import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    @Test
    public void checkGetSound_getMyau() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        assertEquals("Кот должен мяукать",expected, cat.getSound());
    }


    @Test
    public void   checkGetFood_shouldEatMeet() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        //List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(" Ожидается, что кот питается животными, птицами,рыбой " ,expected,cat.getFood());
    }
}
