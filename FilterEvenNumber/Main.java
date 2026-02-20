import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,3,5,9,7,11);
        List<Integer> evennumbers=EvenNumberFilter.filterEvenNumbers(numbers);
        System.out.println("The orginal numbers are: " + numbers);
        System.out.println("The even numbers are: " + evennumbers);


    }
}
