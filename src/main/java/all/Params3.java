package all;

import model.Function;

/**
 * Created by MaciekBihun on 2016-04-30.
 * Ustalanie parametrów równania.
 */
public class Params3 {

    private static final Params3 params = new Params3();
    private static int [] functionParams;
    private Params3(){

    }

    public static Params3 getInstance(){
        return params;
    }

    public void addParams(int [] params){
        functionParams = params;
    }

    public int [] getParams(){
        return functionParams;
    }
}
