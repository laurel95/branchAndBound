import model.Function;
import model.Params;

/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class BranchAndBound2 {

    //Konstruktor pobiera parametry funkcji.
    public BranchAndBound2(String [] parametryZmiennych){

        /**
         * Initialization of this class is only once.
         * We are setting function parameters from string to function object.
         */
        int [] variables = new int[parametryZmiennych.length];
        for(int i = 0; i < parametryZmiennych.length; i++){
            variables[i] = Integer.parseInt(parametryZmiennych[i]);
        }

        Function.Params params = new Function.Params();
        params.setA(variables[0]);
        params.setB(variables[1]);
        params.setC(variables[2]);
        params.setD(variables[3]);
        params.setE(variables[4]);

        Function function = new Function(12, 34, 23, 21, 32);
        System.out.println(function.getFunctionSum());

    }
}
