package all;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MaciekBihun on 2016-04-30.
 */
public class Limits {

    private static final Limits limits = new Limits();
    private static final List<Limit3> limitsList = new ArrayList<Limit3>();

    private Limits(){

    }

    public static Limits getInstance(){
        return limits;
    }

    public static void addLimit(Limit3 limit){
        limitsList.add(limit);
    }

    public List<Limit3> getLimitsList(){
        return limitsList;
    }
}
