import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloClassTest {
    @Test
    public void testAverage()
    {
        //setup
        int a=-5, b=-6, c=-7, d=-9, e=-11;
        double expected =-7.6;

        //invoke
        double actual=HelloClass.average(c, d, e, a, b);

        //analise
        assertEquals(expected, actual,0.01);
    }

}
