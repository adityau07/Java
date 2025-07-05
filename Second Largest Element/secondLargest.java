import java.util.Arrays;

class secondLargest
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,4,20,9};
		
		int second_largest = findSecondLargest(arr);
		
		if(second_largest!=-1)
		{
			System.out.println("Second Largest element is: "+second_largest);
		}
		else
		{
			System.out.println("No second largest element found");
		}
		
	}
	
	static int findSecondLargest(int[] arr)
	{
		Arrays.sort(arr); // sorting the array
		
		int n = arr.length; // length of an array storing in n
		
		int first = arr[n-1]; // first largest element
		
		// traverse backwards to find second largest
		
		for(int i = n-2; i>=0; i--)
		{
			if(arr[i]<first)
			{
				return arr[i];  // second largest element
			}
		}
		
		// if not found return -1;
		return -1;
		
		
	}
}