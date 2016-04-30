import all.Node3;
import all.Params3;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by MaciekBihun on 2016-04-30.
 */
public class NodeTest {

    private Node3 node;
    private static final double [] vars = {40, 8, 8, 3.4, 12.32, 2, 7, 4, 12.4};

    @Before
    public void initialize(){

        int [] params = {7, 5, 8, 2, 7, 4, 9, 3, 11};
        Params3.getInstance().addParams(params);
        node = new Node3(vars);
    }



    @Test
    public void getMinValueTest(){
        assertEquals(node.getMinValue(), 3.4, 0);
    }

}
