package all;

/**
 * Created by MaciekBihun on 2016-04-30.
 */
public class BranchAndBound3 {

    public BranchAndBound3(){

        //Set function parameters.
        int [] parametryRownania = {1, 2, 3, 4, 5};
        Params3 params = Params3.getInstance();
        params.addParams(parametryRownania);

        //Create starting node.
        double [] zmienneStartowe = {3.2, 4.3, 2, 4, 6};
        Node3 startNode = new Node3(zmienneStartowe);

        //Creating limits
        int [] limitParams1 = {2, 3 ,4};
        Limit3 limit1 = new Limit3(limitParams1, ">", 25);

        int [] limitParams2 = {4, 1 ,3, 5};
        Limit3 limit2 = new Limit3(limitParams2, "<=", 25);

        int [] limitParams3 = {2, 3 ,4};
        Limit3 limit3 = new Limit3(limitParams3, ">=", 25);

        //Add limits to collection.
        Limits.addLimit(limit1);
        Limits.addLimit(limit2);
        Limits.addLimit(limit3);

    }
}
