
public class MergeSort {

	public int [] mergeSort(int[] array) {
		
		if(array.length<=1)
			return array;
		int mid=array.length/2;

		int[]left = new int[mid];
		
		int[]right ;

		if(array.length % 2 ==0)
			right=new int [mid];
		else {
			right=new int [mid+1];
			
		}

		int[] result=new int[left.length+right.length];
		
		for (int i = 0; i < mid; i++) {
			left[i]=array[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j]=array[mid+j];
		}
		
		left=mergeSort(left);
		right=mergeSort(right);
		
		result=merge(left,right);
		
		return result;
		
	}

	private int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int leftCounter,rightCounter,resultCounter;
		leftCounter=rightCounter=resultCounter=0;
		int result[]=new int[left.length+ right.length];
		
		while(leftCounter< left.length || rightCounter<right.length) {
			
			if (leftCounter<left.length && rightCounter< right.length)
			{
				if(left[leftCounter]<right[rightCounter]) {
					result[resultCounter++]=left[leftCounter++];
				}
					else {
						result[resultCounter++]=right[rightCounter++];
				}
				
			}
			else if(leftCounter<left.length)
			{
				result[resultCounter++]=left[leftCounter++];
			}
			else if(rightCounter<right.length)
			{
				result[resultCounter++]=right[rightCounter++];
			}

		} 
		
		return result;

	}
	public static void printArr(int[] arr) {
		System.out.println("printArr-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
	public static void main(String[] args) {
		int[]array= {9,8,7,6,5,4,3,2,1,0};
		MergeSort ms=new MergeSort();
		array=ms.mergeSort(array)	;
		printArr(array);
		
	}
}
