public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 5};

		System.out.println(binarySearch(nums, 3));
		System.out.println(binarySearch(nums, 4));
	}

	public static boolean binarySearch(int[] nums, int target) {
		return binarySearch(nums, target, 0, nums.length);
	}


	private static boolean binarySearch(int[] nums, int target, int start, int end) {
		if (start >= end) return false;

		int half = (end - start) / 2 + start;

		if (nums[half] == target) return true;

		if (nums[half] < target) return binarySearch(nums, target, start, half);
		return binarySearch(nums, target, half, end);
	}

}