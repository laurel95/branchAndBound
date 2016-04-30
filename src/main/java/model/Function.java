package model;

/**
 * Created by MaciekBihun on 2016-04-29.
 */
public class Function {

    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double x5;
    public Function(double x1,double x2, double x3, double x4, double x5){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
    }

    public double getFunctionSum(){
        return Params.a * x1 + Params.b * x2 + Params.c * x3 + Params.d * x4+ Params.e * x5;
    }

    public static class Params
    {
        protected static int a = 0;
        protected static int b = 0;
        protected static int c = 0;
        protected static int d = 0;
        protected static int e = 0;

        public void setA(int zmienna) {
            a = zmienna;
        }

        public void setB(int zmienna){
            b = zmienna;
        }

        public void setC(int zmienna) {
            c = zmienna;
        }

        public void setD(int zmienna) {
            d = zmienna;
        }

        public void setE(int zmienna) {
            e = zmienna;
        }

        //It is important to set variables in apprioprate order.
        public int [] getFunctionParams(){
            int [] params = {a, b, c, d, e};
            return params;
        }
    }
}
