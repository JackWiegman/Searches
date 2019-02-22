public class MergeSort {

	public static void main(String[] args) {
		System.out.println(merge("abc", "bcd"));
		System.out.println(mergeSort("MERGESORT"));
	}

	public static String mergeSort(String str) {
		String fin = new String(str);
		mergeSort(fin, 0, fin.length());
		return fin;
	}

	public static void mergeSort(String str, int start, int end) {
		if (end < start) {
			int mid = ((end - start) / 2) + start;


			String left = new String(str.substring(start, mid));
			String right = new String(str.substring(mid + 1, end));

			mergeSort(left, start, mid);
			mergeSort(right, mid, end);

			merge(left, right);
		}
	}

	public static String merge(String str1, String str2) {
		int a = 0, b = 0;
		String sorted = "";
		String letter;

		while (a < str1.length() && b < str2.length()) {
			String let1 = str1.substring(a, a+1);
			String let2 = str2.substring(b, b+1);			

			if (let2.compareTo(let1) >= 0) {
				sorted += let1;
				a++;
			} else {
				sorted += let2;
				b++;
			}
		}

		while (a < str1.length()) {
			letter = str1.substring(a, a+1);
			sorted += letter;
			a++;
		}

		while (b < str2.length()) {
			letter = str2.substring(b, b+1);
			sorted += letter;
			b++;
		}

		return sorted;
	}

}