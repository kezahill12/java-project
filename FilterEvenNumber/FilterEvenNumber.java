import java.util.List;

public class EvenNumberFilter {

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }
}
