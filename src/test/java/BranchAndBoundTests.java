import org.junit.Before;
import org.junit.Test;

/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class BranchAndBoundTests {

    BranchAndBound2 branch;
    @Before
    public void initializeItems(){
        String [] variables = {"12", "32", "2", "1", "23"};
        branch = new BranchAndBound2(variables);
    }

    @Test
    public void test(){
        branch.toString();
    }

}
