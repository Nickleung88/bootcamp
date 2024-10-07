public class Demodouble {

    public static void main (String[] args) {

        // flaot, double
        // 10.3 -> double value
        double d1 = 10.3;
        float f1 = 10.3; // cannot convert from double to float

        //!!byte -> short -> int -> long -> float -> double
        float f2 = 71;
        double d2=71;
        long l2 = 71;
        // no precision loss

        double f3 = 10000.1238901283091830918309;
        System.out.println(f3);

        // 6 -> int value
        // !!!  special case
        byte b10=6;
        short s10 = 6;

        int i11 = 6;
        //b10 = i11;

        //6 -> int value
        // 6L -> long value
        long l12 = 6L;
        float f12 = 6L; //6.0
        System.out.println(f12);
        double d12 = 6L; //6.0
        System.out.println(d12);
        
        // 6.5f
        float f13=6.5f;
        double d13= 6.5f;
        //long l13=6.5f;

        //6.5 or 6.5d







    }
    
}
