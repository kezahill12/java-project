import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers=List.of(0,2,4,6,8,10);
        List<Integer> evennumbers=EvenNumberFilter.filterEvenNumbers(numbers);
        System.out.println("The orginal numbers are: " + numbers);
        System.out.println("The even numbers are: " + evennumbers);


    }
}
