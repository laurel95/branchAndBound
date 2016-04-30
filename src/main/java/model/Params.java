package model;

/**
 * Created by MaciekBihun on 2016-04-29.
 */
public final class Params {


    private Params(){

    }

    public static class Builder
    {
        private  int a = 0;
        private  int b = 0;
        private  int c = 0;
        private  int d = 0;
        private  int e = 0;

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b){
            this.b = b;
        }

        public void setC(int c) {
            this.c = c;
        }

        public void setD(int d) {
            this.d = d;
        }

        public void setE(int e) {
            this.e = e;
        }

        //It is important to set variables in apprioprate order.
        public int [] getFunctionParams(){
            int [] params = {a, b, c, d, e};
            return params;
        }
    }

}
