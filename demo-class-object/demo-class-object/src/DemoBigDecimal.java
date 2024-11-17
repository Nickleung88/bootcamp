import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    //0.2+0.1
    System.out.println(0.1+0.1);//0.2
    System.out.println(0.2+0.1);//0.30000000000000004

    //Java Solution: Bulit-in class
    BigDecimal bd = new BigDecimal(10L);
    BigDecimal bd2 = new BigDecimal("10");

    System.out.println(bd.doubleValue());//10.0
    long result = bd.longValue();
    System.out.println(result);//10

    int x = bd2.intValue();
    System.out.println(x);//10


    
    BigDecimal result2 = new BigDecimal(0.2).add(new BigDecimal(0.1));
    System.out.println(result2.doubleValue());//0.30000000000000004

    BigDecimal result3 = new BigDecimal("0.2").add(new BigDecimal("0.1"));
    System.out.println(result3.doubleValue());//0.3

    System.out.println(
    BigDecimal.valueOf(9).divide(BigDecimal.valueOf(3)).doubleValue());

    System.out.println(
      BigDecimal.valueOf(9).divide(BigDecimal.valueOf(2)).doubleValue());

      System.out.println(
        BigDecimal.valueOf(10));
        .divide(BigDecimal.valueOf(3));
  }
}
