public class MergeSort {

	public static void main(String[] args) {
		System.out.println(merge("abc", "bcf"));
	}

	public static String merge(String a, String b) {
		String fin = "";

		int i = 1, j = 1;
		int n = (a.substring(i - 1, i)).compareTo(b.substring(j - 1, j));

		while (i < a.length() || j < b.length()) {

			if (i < a.length() - 1 && j < b.length() - 1) {
				n = (a.substring(i - 1, i)).compareTo(b.substring(j - 1, j));
			}

			if (n >= 1) {
				fin += a.substring(i - 1, i);
				i++;
			} else if (n == 0) {
				fin += a.substring(i - 1, i);
				fin += b.substring(j - 1, j);
				i++;
				j++;
			} else if (j < b.length()) {
				fin += b.substring(j - 1, j);
				j++;
			}

		}

		if (i >= a.length()) {
			fin += b.substring(j);
		} else if (j >= b.length()) {
			fin += a.substring(i);
		}

		return fin;
		// while (i < a.length() && j < b.length()) {
		// 	n = (a.substring(i, i+1)).compareTo(b.substring(j, j+1));
		// 	System.out.println(n);

		// 	if (i >= a.length()) {
		// 		fin += b.substring(j);
		// 		j = b.length();
		// 	} else if (j >= b.length()) {
		// 		fin += a.substring(i);
		// 		i = a.length();
		// 	} else if (n >= 1) {
		// 		fin += a.substring(i, i+1);
		// 		i++;
		// 	} else if (n == 0) {
		// 		fin += a.substring(i, i+1);
		// 		fin += b.substring(j, j+1);
		// 		i++;
		// 		j++;
		// 	} else {
		// 		fin += b.substring(j, j+1);
		// 		j++;
		// 	}
		// }

		// return fin;

		// for (int k = 0; k < str1.length() + str2.length(); k++) {
		// 	n = (str1.substring(i, i+1)).compareTo(str2.substring(j, j+1));

		// 	if (i >= str1.length()) fin += str2.substring(j);
		// 	else if ()

		// 	if (i < str1.length()) {
		// 		if (j < str2.length()) {
		// 			if (n == 1) {
		// 				fin += str1.substring(i, i+1);
		// 				i++;
		// 			} else if (n == 0) {
		// 				fin += str1.substring(i, i+1);
		// 				fin += str2.substring(j, j+1);
		// 				i++;
		// 				j++;
		// 			} else {
		// 				fin += str2.substring(j, j+1)
		// 				j++;
		// 			}
		// 		} else {
		// 			fin += str1.substring(i);
		// 		}
		// 	} else if (j < str2.length()) {
		// 		fin += st
		// 	}

			

		// 	if (n == 1) {
		// 		str1.substring
		// 	}

			// n = (str1.substring(i, i+1)).compareTo(str2.substring(i, i+1)); // -1, 0, 1
			// System.out.println("n = " + n);

			// if (n == 1) {
			// 	fin += str1.substring(i, i+1);
			// 	System.out.println("1");
			// } else if (n == 0) {
			// 	fin += str1.substring(i, i+1);
			// 	fin += str2.substring(i, i+1);
			// 	System.out.println("0");
			// } else {
			// 	fin += str2.substring(i, i+1);
			// 	System.out.println("-1");
			// }

		
	}

}