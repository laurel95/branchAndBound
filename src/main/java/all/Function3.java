package all;

/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class Function3 {

    private int [] variables;
    private static int [] params;

    public Function3(int [] variables){
        this.variables = variables;

        //get function parameters.
        params = Params3.getInstance().getParams();
    }

    //Count function sum depends on number of variables.
    public double getFunctionSum(){
        int suma = 0;
        for(int i = 0; i < variables.length; i++){
            suma += variables[i] * params[i];
        }
        return suma;
    }

}
