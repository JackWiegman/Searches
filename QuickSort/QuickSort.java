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
		int pivotIndex = Math.random() * (str.length() - 1);
		String pivot = str.substring(pivotIndex, pivotIndex+1);


		// REORDER LIST
		for (int i = 0; i < str.length(); i++) {
			String current = str.substring(i, i+1);
			if (pivotIndex.compareTo(current) >= 0) {
				
			}
		}

		


	}

}