package arrays;

public class CountClumps {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4 };
		System.out.println(countClumps(arr));
	}

	public static int countClumps(int[] nums) {
		int count = 0;// counts adjacent values that are same.
		int clumps = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > 0) {
				if (nums[i] == nums[i - 1]) {
					count += 1;
				} else {
					count = 0;
				}
			}
			if (count == 1) {
				clumps++;
			}
		}
		return clumps;
	}


}
