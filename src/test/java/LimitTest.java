import all.Limit3;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class LimitTest {

    private Limit3 limit;
    @Before
    public void initialize(){
        int [] zmienne = {12, 3, 34, 23, 54, 76, 87};
        limit = new Limit3(zmienne, ">", 214);
    }

    @Test
    public void test(){
       /* int [] zmienne = {12, 43, 54, 6};
        boolean result = limit.checkIfFulfilEquation(zmienne);
        assertEquals(result, true);*/
    }


}
