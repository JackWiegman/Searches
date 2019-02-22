public class QuickSort {

	public static void main(String[] args) {

	}

	public static void quickSort(String str, int start, int end) {
		// RECURSE
		int mid = ((end - start) / 2) + start;
		if (end > start) {
			int partIndex = partition(str, start, end);

			quickSort(str, start, partIndex);
			quickSort(str, partIndex + 1, end);
		}
	}

	public static void partition(String str, int start, int end) {
		// PICK A PIVOT
		int pivotIndex = Math.random() * str.length();


		// REORDER LIST
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(pivotIndex, pivotIndex + 1).compareTo())
		}

		


	}

}