import org.junit.Test;
public class Class1Test {
    @Test
    public void testAverage()
    {
        int a=5, b=6, c=7, d=9, e=11;
        double expected = 7.6;


        double actual = Class1.average(c,d,e,a,b);

        assertEquals(expected, actual, 0.01);
        

    }
    
}
