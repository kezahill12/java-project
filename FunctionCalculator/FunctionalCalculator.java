import java.util.function.BiFunction;

public class FunctionalCalculator {

    
    public static Integer calculate(int num1, int num2,
                                    BiFunction<Integer, Integer, Integer> operation) {

        return operation.apply(num1, num2);
    }
}
