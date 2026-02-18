import java.util.Arrays;

public class GenericArrayUtility {

/**
 * Merges two arrays of the same type into one new array.
 *
 * How it works:
 * - If both arrays are non-null, it creates a new array large enough
 *   to hold both arrays and copies their elements into it.
 * - If one array is null, it returns a copy of the other array.
 * - If both arrays are null, it returns an empty Object array.
 *
 * Where it is used in real projects:
 * - Combining results from multiple data sources
 * - Merging configuration values
 * - Joining datasets before processing
 * - Utility/helper classes in libraries
 */
public static <T> T[] mergeArrays(T[] array1, T[] array2) {

    // If both arrays are null → return empty array
    if (array1 == null && array2 == null) {
        return (T[]) new Object[0];
    }

    // If first array is null → return copy of second
    if (array1 == null) {
        return Arrays.copyOf(array2, array2.length);
    }

    // If second array is null → return copy of first
    if (array2 == null) {
        return Arrays.copyOf(array1, array1.length);
    }

    // Normal merge when both arrays are not null
    @SuppressWarnings("unchecked")
    T[] merged = Arrays.copyOf(array1, array1.length + array2.length);
    System.arraycopy(array2, 0, merged, array1.length, array2.length);

    return merged;
}


    
    
}
