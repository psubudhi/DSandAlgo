
public class BubbleSortAlgo {
	public int[] exch(int [] arr,int i,int j)
	{
		
		int tmpInt=arr[i];
		arr[i]=arr[j];
		arr[j]=tmpInt;
		return arr;
	}

	public int[] doBubbleSearch(int[]arr )
	{
		int len=arr.length;
		for (int i1 = 0; i1 < arr.length; i1++) {
			for (int i = 0,j=i+1; i < len-1 && j < len; i++,j++) {

				System.out.println("\n  i="+i+",j="+j);
				System.out.println("\n"+arr[i]+","+arr[j]);
				if(arr[i]<arr[j])
				{
					exch( arr, i, j);
					printArr(arr);
				}
			}
			
			len=len-1;
		}
			
		return arr;
	}
	public static void printArr(int[] arr)
	{
		System.out.println("printArr-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}		
	}
	public static void main(String[] args) {
		int[] arr= {8,7,0,11,45,67,32,6,5,4,2,1};
		printArr(arr);
		BubbleSortAlgo bs=new BubbleSortAlgo();
		bs.doBubbleSearch(arr);
		printArr(arr);
		
	}
}
