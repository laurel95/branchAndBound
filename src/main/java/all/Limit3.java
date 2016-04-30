package all;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class Limit3 {

    private String equationSign;
    private int [] params;
    private int result;

    public Limit3(int [] params, String equationSign, int result){
        this.params = params;
        this.equationSign = equationSign;
        this.result = result;
    }

    /*
    Serve a int array and check weather matches equation input.
     */
    public boolean checkIfFulfilEquation(double [] variables){
        double sum = 0;
        if(equationSign.equals(">")){
            for(int i = 0; i < variables.length; i++){
                sum += params[i] * variables[i];
            }
            if(sum > result)
                return true;
        } else if(equationSign.equals("<")){

            for(int i = 0; i < variables.length; i++){
                sum += params[i] * variables[i];
            }
            if(sum < result)
                return true;

        } else if(equationSign.equals(">=")){

            for(int i = 0; i < variables.length; i++){
                sum += params[i] * variables[i];
            }
            if(sum >= result)
                return true;
        } else if(equationSign.equals("<=")){

            for(int i = 0; i < variables.length; i++){
                sum += params[i] * variables[i];
            }
            if(sum <= result)
                return true;
        }
        return false;
    }


}
