package all;

import java.util.*;

/**
 * Created by MaciekBihun on 2016-04-30.
 */
public class Node3 {

    //get function limits
    private List<Limit3> limits;

    //get function params.
    private int [] params;

    //get function variables
    private double [] variables;

    public Node3(double [] variables){
        this.variables = variables;
        params = Params3.getInstance().getParams();
        limits = Limits.getInstance().getLimitsList();
    }

    //Get result of the function equation.
    public int getFunctionSum(){
        int suma = 0;
        for(int i = 0; i < variables.length; i++){
            suma += variables[i] * params[i];
        }
        return suma;
    }

    private double [] getNotIntegerVariables(){
        double [] notAbsoluteVariablesArray = new double[variables.length];
        for (int i = 0; i < variables.length; i++) {
            //jeśli liczba jest nie całkowita
            if (!((variables[i] == Math.floor(variables[i])) && !Double.isInfinite(variables[i]))) {
                //dodaj ją do tablicy liczb nie całkowitych.
                notAbsoluteVariablesArray[i] = variables[i];
            }
        }
        return notAbsoluteVariablesArray;
    }

    //Połącz parametry funkcji z wartościami zmiennych i zwróc wartość z paramterem minimalnym.
    public double getMinValue(){
        //All parameters
        int [] params = Params3.getInstance().getParams();

        //Not integer variables.
        double [] notIntegerArray = getNotIntegerVariables();

        //klucze
        List <Integer> keys = new ArrayList<Integer>();

        //values
        List<Double> values = new ArrayList<Double>();

        for(int i = 0; i < variables.length; i++){
            if(variables[i] == notIntegerArray[i]){
                keys.add(params[i]);
                values.add(notIntegerArray[i]);
            }

        }

        //get variable with min param.
        int minValue = keys.get(0);
        int counter = 0;
        for (int i = 0; i < keys.size(); i++){
            if(keys.get(i) < minValue){
                minValue = keys.get(i);
                counter++;
            }
        }

        return values.get(counter);
    }
    
}
