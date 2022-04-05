
public class SelSortAlgo {
	public int[] exch(int[] arr, int i, int j) {
		int tmpInt = arr[i];
		arr[i] = arr[j];
		arr[j] = tmpInt;
		return arr;
	}

	public int getMinIndex(int[] arr, int pointer) {
		int len = arr.length;
		int minIndex = pointer;
		for (int j = pointer + 1; j < len; j++) {
			System.out.println("\n" + arr[j] + "<--arr[j]n=arr[pointer]=>" + arr[pointer]);
			if (arr[j] < arr[minIndex])
				minIndex = j;
		}
		return minIndex;
	}

	public int[] doSelSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = getMinIndex(arr, i);
			System.out.println(i + "--Min=" + min);
			exch(arr, i, min);
			printArr(arr);
		}

		return arr;
	}

	public static void printArr(int[] arr) {
		System.out.println("printArr-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 8, 7, 0, 11, 45, 67, 32, 6, 5, 4, 2, 1 };
		printArr(arr);
		SelSortAlgo bs = new SelSortAlgo();
		bs.doSelSort(arr);
		printArr(arr);

	}
}
