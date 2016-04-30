import model.Params;

/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class Node {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;

    private int x1 = 0;
    private int x2 = 0;
    private int x3 = 0;
    private int x4 = 0;
    private int x5 = 0;

    public Node(){

        Params.Builder params = new Params.Builder();
        int [] functionParams = params.getFunctionParams();

        //Initialization function parameters.
        a = functionParams[0];
        b = functionParams[1];
        c = functionParams[2];
        d = functionParams[3];
        e = functionParams[4];
    }

}
