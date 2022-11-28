import java.util.Collections;
import java.util.Arrays;
public class sortmethod {
    public static void main(String[] args)   
    {   
    //defining an array of integer type   
    int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
    //invoking sort() method of the Arrays class  
    Arrays.sort(array);   

    //without sort method
    //sorting logic  
/*for (int i = 0; i < array.length; i++)   
{  
for (int j = i + 1; j < array.length; j++)   
{  
int tmp = 0;  
if (array[i] > array[j])   
{  
tmp = array[i];  
array[i] = array[j];  
array[j] = tmp;  
}  
} */ 


//using reverseMethod()
// A sample Java program to sort an array
// in descending order using Arrays.sort().
		// Note that we have Integer here instead of
		// int[] as Collections.reverseOrder doesn't
		// work for primitive types.
		/*Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

		// Sorts arr[] in descending order
		Arrays.sort(arr, Collections.reverseOrder());

		System.out.printf("Modified arr[] : %s",
						Arrays.toString(arr));
	}
}*/

    System.out.println("Elements of array sorted in ascending order: ");  
    //prints array using the for loop  
    for (int i = 0; i < array.length; i++)   
    {       
    System.out.println(array[i]);   
    }   
    }  
    
}
