import java.sql.Date;

// Java implementation of recursive Binary Search
class BSearch {
	// Returns index of x if it is present in arr[l..
	// r], else return -1
	int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;
 
			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}
	public int binarySearchNew(int[]arr, int start, int end, int value)
	{
		int mid=(start +end)/2;
		if (start>end)
		return -1;
		if(arr[mid]==value)
			return mid;
		System.out.println("start="+start);
		System.out.println("end="+end);
		System.out.println("MID="+mid);
		System.out.println("arr[mid]="+arr[mid]);
		System.out.println("value="+value);
		if(arr[mid]<value)
		{
			return binarySearchNew(arr, mid+1, end, value);
		}
		if(arr[mid]>value)
		{
			return binarySearchNew(arr, start, mid-1, value);
		}
		
		return -1;
	}
	// Driver method to test above
	public static void main(String args[])
	{
		System.out.println(new java.util.Date());
		BSearch ob = new BSearch();
		int arr[] = { 2, 3, 4, 10, 15,16,17,18,20,25,30,35, 40 };
		int n = arr.length;
		int x = 25;
		int result = ob.binarySearchNew(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "
							+ result);
		System.out.println(new java.util.Date());
	}
}
/* This code is contributed by Rajat Mishra */