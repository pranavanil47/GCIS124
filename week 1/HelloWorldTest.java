import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest 
{
    @Test
    public void testAverage()
    {
        //setup
        int a=1,b=2,c=3,d=4,e=5;
        double expected=3.0;

        //invoke
        double actual = HelloWorld.average(c, d, e, a, b);

        //analyse
        assertEquals(expected, actual, 0.01);
    }
    
}
