import Canculator.Division;
import Canculator.*;
import org.junit.Assert;
import org.junit.Test;

public class TestsCanculator {

    @Test
    public void DivisionTest()
    {
        Assert.assertEquals("Посчитанно не верно",Division.Act(4,2),2);
    }
    @Test
    public void AdditionTest()
    {
        Assert.assertEquals("Посчитанно не верно",Multiplication.Act(4,2),8);
    }
}
