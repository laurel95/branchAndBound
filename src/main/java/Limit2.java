/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class Limit2 {
    /*private int[] tablicaZmiennych;
    private String znakNierownosci;
    private int wynikNierownosci = 130;
    private String[] params;
    private double rownanie;
    private int amountOfVariables;

    public Limit(String[] limit){
        //tablica o wielkosci -2, bo bez znaku równości oraz wyniku.
        amountOfVariables = limit.length;
        tablicaZmiennych = new int[limit.length - 2];
        znakNierownosci = limit[limit.length - 2];
        //wynikNierownosci = Integer.parseInt(limit[limit.length - 1]);
        for (int i = 0; i < tablicaZmiennych.length; i++) {
            tablicaZmiennych[i] = Integer.parseInt(limit[i]);
        }

    }

    public boolean isFulfilEquation(double[] xTab) {
        if (znakNierownosci.equals("<")) {
            if (xTab.length == 2) {
                return equationForTwoVariables(xTab[0], xTab[1]) < wynikNierownosci;
            } else if (xTab.length == 3){
                return equationForThreeVariables(xTab[0], xTab[1], xTab[2]) < wynikNierownosci;
            } else if(xTab.length == 4){
                return equationForFourVariables(xTab[0], xTab[1], xTab[2], xTab[3]) < wynikNierownosci;
            } else {
                return equationForFiveVariables(xTab[0], xTab[1], xTab[2], xTab[3], xTab[4]) < wynikNierownosci;
            }
        } else if(znakNierownosci.equals(">")){
            if (xTab.length == 2) {
                return equationForTwoVariables(xTab[0], xTab[1]) > wynikNierownosci;
            } else if (xTab.length == 3){
                return equationForThreeVariables(xTab[0], xTab[1], xTab[2]) > wynikNierownosci;
            } else if(xTab.length == 4){
                return equationForFourVariables(xTab[0], xTab[1], xTab[2], xTab[3]) > wynikNierownosci;
            } else {
                return equationForFiveVariables(xTab[0], xTab[1], xTab[2], xTab[3], xTab[4]) > wynikNierownosci;
            }
        } else if(znakNierownosci.equals("<=")){
            if (xTab.length == 2) {
                return equationForTwoVariables(xTab[0], xTab[1]) <= wynikNierownosci;
            } else if (xTab.length == 3){
                return equationForThreeVariables(xTab[0], xTab[1], xTab[2]) <= wynikNierownosci;
            } else if(xTab.length == 4){
                return equationForFourVariables(xTab[0], xTab[1], xTab[2], xTab[3]) <= wynikNierownosci;
            } else {
                return equationForFiveVariables(xTab[0], xTab[1], xTab[2], xTab[3], xTab[4]) <= wynikNierownosci;
            }
        } else {
            if (xTab.length == 2) {
                return equationForTwoVariables(xTab[0], xTab[1]) >= wynikNierownosci;
            } else if (xTab.length == 3){
                return equationForThreeVariables(xTab[0], xTab[1], xTab[2]) >= wynikNierownosci;
            } else if(xTab.length == 4){
                return equationForFourVariables(xTab[0], xTab[1], xTab[2], xTab[3]) >= wynikNierownosci;
            } else {
                return equationForFiveVariables(xTab[0], xTab[1], xTab[2], xTab[3], xTab[4]) >= wynikNierownosci;
            }
        }

    }

    private double equationForTwoVariables(double x1, double x2) {
        return tablicaZmiennych[0] * x1 + tablicaZmiennych[1] * x2;
    }

    private double equationForThreeVariables(double x1, double x2, double x3) {
        return tablicaZmiennych[0] * x1 + tablicaZmiennych[1] * x2 + tablicaZmiennych[2] * x3;
    }

    private double equationForFourVariables(double x1, double x2, double x3, double x4) {
        return tablicaZmiennych[0] * x1 + tablicaZmiennych[1] * x2 + tablicaZmiennych[2] * x3
                + tablicaZmiennych[3] * x4;
    }

    private double equationForFiveVariables(double x1, double x2, double x3, double x4, double x5) {
        return tablicaZmiennych[0] * x1 + tablicaZmiennych[1] * x2 + tablicaZmiennych[2] * x3
                + tablicaZmiennych[3] * x4 + tablicaZmiennych[4] * x5;
    }*/
}
