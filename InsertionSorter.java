public class InsertionSorter {

	public static void main(String[] args) {
		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		InsertionSorter is = new InsertionSorter();
		is.doInsertionSort(arr);
		printArr(arr);
	}
	public static void printArr(int[] arr) {
		System.out.println("printArr-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
	private void doInsertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;

		}

	}
}