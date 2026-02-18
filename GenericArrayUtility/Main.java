import java.lang.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {4, 5, 6};
        Integer[] mergedIntArray = GenericArrayUtility.mergeArrays(array1, array2);
        System.out.print("merged Integer Array: " +  Arrays.toString(mergedIntArray));
        
        System.out.println();

        String[] array3 = {"Apple", "Banana"};
        String[] array4 = {"Cherry", "Date"};
        String[] mergedStringArray = GenericArrayUtility.mergeArrays(array3, array4);
        System.out.print("Merged String Array: " + Arrays.toString(mergedStringArray));

        if (mergedIntArray == null) {
            System.out.println("Merged String Array: " + Arrays.toString(mergedIntArray));
        }
    }
} 
