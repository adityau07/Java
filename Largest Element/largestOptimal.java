class largestOptimal
{
	public static void main(String[] args)
	{
		int[] arr = {30,10,60,100,20};
		
		int largest_element = findLargestElement(arr);
		
		System.out.println("Largest element is: "+largest_element);
	}
	
	static int findLargestElement(int[] arr)
	{
		int largest = arr[0];
		
		int n = arr.length;
		
		for(int i = 0; i<n; i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		return largest;
	}
}