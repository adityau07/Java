class secondLargestBetter
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,4,7,7,5};
		
		int second_largest = findsecondLargest(arr);
		
		if(second_largest!=-1)
		{
			System.out.println("Second Largest Element is: "+second_largest);
		}
		else
		{
			System.out.println("No Second Largest Element");
		}
		
	}
	
	static int findsecondLargest(int[] arr)
	{
		int n = arr.length;
		
		int largest = arr[0];
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		
		int slargest = -1;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]>slargest && arr[i]!=largest)
			{
				slargest = arr[i];
			}
		}
		return slargest;
	}
}