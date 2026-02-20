import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        int num1 =40;
        int num2 = 50;
        
        BiFunction<Integer, Integer, Integer> addition =
                (a, b) -> a + b;
        
        BiFunction<Integer, Integer, Integer> subtraction =
                (a, b) -> a - b;

        BiFunction<Integer, Integer, Integer> multiplication =
                (a, b) -> a * b;

        BiFunction<Integer, Integer, Integer> division =
                (a, b) -> a / b;


        System.out.println("Addition of two values is: " + num1 + " + " + num2 +
                " = " + FunctionalCalculator.calculate(num1, num2, addition));

        System.out.println("Subtraction of two values is: " + num1 + " - " + num2 +
                " = " + FunctionalCalculator.calculate(num1, num2, subtraction));

        System.out.println("Multiplication of two values is: " + num1 + " * " + num2 +
                " = " + FunctionalCalculator.calculate(num1, num2, multiplication));

        System.out.println("Division of two values is: " + num1 + " / " + num2 +
                " = " + FunctionalCalculator.calculate(num1, num2, division));
    }
}
