package recursion;

public class GroupSum {

	public static void main(String[] args) {
		int array [] = {2, 4, 8};
		System.out.println(groupSum(0, array, 10));
	}
	public static boolean groupSum(int start, int[] nums, int target) {
		// base condition : every index has been checked and target has been reduced to 0 by accomplishing sum succesfully.
		if (start >= nums.length) {
			return (target==0);
		}
		if (groupSum(start+1, nums, target - nums[start])) {
			return true;
		}

		if (groupSum(start+1, nums, target)) {
			return true;
		}
		return false;
	}
}




