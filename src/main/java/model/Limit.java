package model;

/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class Limit {

    private  int a = 0;
    private  int b = 0;
    private  int c = 0;
    private  int d = 0;
    private  int e = 0;

    private int wynik = 0;

    private String [] limit;

    //Array limit is always 7 elements long.
    public Limit(String [] limit){
        this.limit = limit;
        a = Integer.parseInt(limit[0]);
        b = Integer.parseInt(limit[1]);
        c = Integer.parseInt(limit[2]);
        d = Integer.parseInt(limit[3]);
        e = Integer.parseInt(limit[4]);

        wynik = Integer.parseInt(limit[6]);

    }

   /* private boolean createLowerEquation(){

    }

    private boolean createBiggerEquation(){

    }

    private boolean createBiggerEqualEquation(){

    }

    private boolean createLowerEqualEquation(){

    }*/


}
