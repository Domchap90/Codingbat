package arrays;

public class MaxMirror {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 4 };
		System.out.println(maxMirror(arr));
	}

	public static int maxMirror(int[] nums) {
		int count = 0;
		int max = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = len - 1; i + count < len && j > -1; j--) {
				if (nums[i + count] == nums[j]) {
					count++;
				} else {
					count = 0;
				}
				if (count > max) {
					max = count;
				}
			}
		}
		return max;
	}

}
