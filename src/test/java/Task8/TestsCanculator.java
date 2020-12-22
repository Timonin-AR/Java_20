package Task8;

import Task5.Canculator.Division;
import Task5.Canculator.*;
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
