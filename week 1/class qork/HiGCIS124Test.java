import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class HiGCIS124Test {
    @Test
    public void testAdd3()
    {
        //setup
        int a=3;
        int b=4;
        int c=5;
        int expected = 12;

        //invoke
        int actual = HiGCIS124.add3(a, b, c);

        //analyse
        assertEquals(expected, actual);
    }

    @Test
    public void testAverage(){
        //setup
        int a=1, b=2, c=3, d=4, e=5;
        double expected = 3.0;

        //invoke
        double actual = HiGCIS124.average(c, d, e, a, b);

        //analise
        assertEquals(expected, actual);
    }
}
