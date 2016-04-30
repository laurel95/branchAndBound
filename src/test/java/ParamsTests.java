import model.Params;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by MaciekBihun on 2016-04-29.
 */

public class ParamsTests {

    Params.Builder params;

    @Before
    public void initializeVariables(){
        String [] parametryZmiennych = {"34", "34", "1", "54", "23"};
        int [] variables = new int[parametryZmiennych.length];
        for(int i = 0; i < parametryZmiennych.length; i++){
            variables[i] = Integer.parseInt(parametryZmiennych[i]);
        }

        params = new Params.Builder();
        params.setA(variables[0]);
        params.setB(variables[1]);
        params.setC(variables[2]);
        params.setD(variables[3]);
        params.setE(variables[4]);
    }

    @Test
    public void test(){

        for(int i = 0 ; i < params.getFunctionParams().length; i++){
            System.out.println(params.getFunctionParams()[i]);
        }
    }

}
