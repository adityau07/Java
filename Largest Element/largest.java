import java.util.Arrays;

class largest
{
	public static void main(String[] args)
	{
		int[] arr = {10,50,70,90,30};
		
		int largest_element = findLargestElement(arr);
		
		System.out.println("Largest element is: "+largest_element);
	}
	
	static int findLargestElement(int[] arr)
	{
		Arrays.sort(arr);
		
		int n = arr.length;
		
		int largest = arr[n-1];
		
		return largest;
	}
}