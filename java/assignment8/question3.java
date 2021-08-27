package lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class question3 {
    public static void main(String[] args) {
        Consumer print=System.out::println;
        print.accept("hii");

        Supplier getRandom=java.lang.Math::random;
        print.accept(getRandom.get());

        String a="888";
        Predicate<String> stringEquals=a::equals;
        print.accept(stringEquals.test("888"));

    }
}