import java.util.Arrays;
public class SubArray {
    // Java program to sort a subarray
// using Arrays.sort()

// Importing Arrays class from java.util package


	// Main drive method
	public static void main(String[] args)
	{
		// Custom input array
		int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

		// Sort subarray from index 1 to 4, i.e.,
		// only sort subarray {7, 6, 45, 21} and
		// keep other elements as it is.
		Arrays.sort(arr, 1, 5);

		// Printing sorted array
		System.out.printf("Modified arr[] : %s",
						Arrays.toString(arr));
	}
    
}
