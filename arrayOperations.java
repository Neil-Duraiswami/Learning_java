import java.util.Arrays;
import java.util.*;
public class arrayOperations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int i= input.nextInt();
		int arr[]=new int[i]; 
	    int n=i;		
		System.out.println("Enter into Array:");
		
		for(i=0;i<n;i++)
		{
		arr[i]=input.nextInt(); 
		}
		System.out.println("Entered Elements:");
		for(i=0;i<n;i++)             //Display array
		{
		System.out.println(arr[i]);
		}
		Arrays.sort(arr);
        
		
		System.out.println("Sorted elements Elements:");
		for(i=0;i<n;i++)             //Display array
		{
		System.out.println(arr[i]);
		}
	}

}
