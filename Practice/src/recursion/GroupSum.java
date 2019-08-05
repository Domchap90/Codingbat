package recursion;

public class GroupSum {

	public static void main(String[] args) {
		int array [] = {2, 4, 8};
		System.out.println(groupNoAdj(0, array, 7));
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

	public static boolean groupSum6(int start, int[] nums, int target) { // MUST INCLUDE 6s if they exist within array.
		if (start >= nums.length) {
			return (target == 0);
		}
		if (nums[start] == 6) {
			if (groupSum6(start + 1, nums, target - 6)) {
				return true;
			}
		} else {
			if (groupSum6(start + 1, nums, target - nums[start])) {
				return true;
			}
			if (groupSum6(start + 1, nums, target)) {
				return true;
			}
		}
		return false;
	}

	public static boolean groupNoAdj(int start, int[] nums, int target) {
		// base condition : every index has been checked and target has been reduced to
		// 0 by accomplishing sum succesfully.
		if (start >= nums.length) {
			return (target == 0);
		}
		if (groupNoAdj(start + 1, nums, target - nums[start])) {
			return true;
		}

		if (groupNoAdj(start + 1, nums, target)) {
			return true;
		}
		return false;
	}

	public static boolean groupSum5(int start, int[] nums, int target) {
		if (start >= nums.length) {
			return (target == 0);
		}
		if (nums[start] % 5 == 0) {
			if (groupSum5(start + 1, nums, target - nums[start])) {
				return true;
			}
		} else if (start > 0 && nums[start] == 1 && nums[start - 1] % 5 == 0) {
			if (groupSum5(start + 1, nums, target)) {
				return true;
			}
		} else {
			if (groupSum5(start + 1, nums, target - nums[start])) {
				return true;
			}
			if (groupSum5(start + 1, nums, target)) {
				return true;
			}
		}
		return false;
	}

}




