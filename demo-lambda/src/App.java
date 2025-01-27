
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) throws Exception {
        Supplier<Integer> random = () -> new Random().nextInt(100) + 1;
        System.out.println(random.get());

        Predicate<String> isToolong = s -> s.length() >= 5;
        System.out.println(isToolong.test("Amy"));
        System.out.println(isToolong.test("Vincent"));

        BiPredicate<String, String> equalString = (s1, s2) -> s1.equals(s2);
        System.out.println(equalString.test("Hello", "Hello"));
        System.out.println(equalString.test("Hello", "hello"));

        UnaryOperator<Double> squareArea = length -> length * length;
        System.out.println(squareArea.apply(9.0));

        BinaryOperator<Double> rectArea = (l1,l2) -> l1 * l2 ;
        System.out.println(rectArea.apply(3.3,4.2));


    }
}
