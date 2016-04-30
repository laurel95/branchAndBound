/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class Node2 {

    /*//parametry równania
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    //tablica parametrów
    private int[] params = {a, b, c, d, e};

    //zmienne równania
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double x5;

    //tablica zmiennych
    private double[] variables = {x1, x2, x3, x4, x5};

    private List<Integer> parametryZmiennych;

    @SuppressWarnings("empty-statement")
    public Node(String[] parametryZmiennychString) {
        //niektóre mogą być 0.
        a = Integer.parseInt(parametryZmiennychString[0]);
        b = Integer.parseInt(parametryZmiennychString[1]);
        c = Integer.parseInt(parametryZmiennychString[2]);
        d = Integer.parseInt(parametryZmiennychString[3]);
        e = Integer.parseInt(parametryZmiennychString[4]);

        parametryZmiennych.add(a);
        parametryZmiennych.add(b);
        parametryZmiennych.add(c);
        parametryZmiennych.add(d);
        parametryZmiennych.add(e);


    }

    //pobierz mape liczb nie całkowitych z ich indeksami w tablicy variables.
    private Map<Integer,Double> getNotAbsoluteVariablesMap() {
        Map<Integer, Double> notAbsoluteVariablesMap = new TreeMap<Integer, Double>();
        for (int i = 0; i < variables.length; i++) {
            //jeśli liczba jest nie całkowita
            if (!((variables[i] == Math.floor(variables[i])) && !Double.isInfinite(variables[i]))) {
                notAbsoluteVariablesMap.put(i, variables[i]);
            }
        }
        return  notAbsoluteVariablesMap;
    }

    //pobierz zmienną niecałkowitą z najwiekszym współczynnikiem.
    private double getMaxParameterFromFunction(){
        int maxParam = 0;
        int index = 0;
        Set<Integer> keysSet = getNotAbsoluteVariablesMap().keySet();
        while(keysSet.iterator().hasNext()){
            int param = parametryZmiennych.get(keysSet.iterator().next());
            if(param > maxParam)
                index = keysSet.iterator().next();
            maxParam = param;
        }
        return variables[index];
    }*/


}
