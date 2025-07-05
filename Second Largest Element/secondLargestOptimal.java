class secondLargestOptimal
{
	public static void main(String[] args)
	{
		int[] arr = {12,35,1,10,34,1};
		
		int slargest = findSecondLargest(arr);
		
		if(slargest!=-1)
		{
			System.out.println("Second Largest element is: "+slargest);
		}
		else
		{
			System.out.println("No second Largest element");
		}
	}
	
	static int findSecondLargest(int[] arr)
	{
		int n = arr.length;
		
		int largest = -1;
		
		int secondLargest = -1;
		
		for(int i =0; i<n; i++)
		{
			// If arr[i] > largest, update second largest with
            // largest and largest with arr[i]
			if(arr[i]>largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			
			// If arr[i] < largest and arr[i] > second largest, 
            // update second largest with arr[i]
			else if(arr[i]<largest && arr[i]>secondLargest)
			{
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
}