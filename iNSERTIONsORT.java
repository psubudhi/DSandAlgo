import java.util.Iterator;

public class iNSERTIONsORT {
	

	public int[] exch(int [] arr,int i,int j)
	{
		
		int tmpInt=arr[i];
		arr[i]=arr[j];
		arr[j]=tmpInt;
		return arr;
	}
	public static void printArr(int[] arr)
	{
		System.out.println("printArr-");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}		
	}public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    

}
