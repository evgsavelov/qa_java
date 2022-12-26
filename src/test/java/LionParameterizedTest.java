

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private String sex;
    private  boolean expectedResult;

    public LionParameterizedTest(String sex, boolean expectedResult){
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true}
        };
    }


    @Test
    public void checkDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
