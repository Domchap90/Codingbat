package recursion;

public class GroupSum {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 10, 10, 1, 1 };
		System.out.println(splitArray(array));
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

	public static boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length) {
			return target == 0;
		}
		int i = start + 1;
		for (; i < nums.length && nums[start] == nums[i]; i++) {
			;// simply bumps up i to the position beyond start where the adjacent indices are
				// no longer the same.
		}
		if (groupSumClump(i, nums, target - ((i - start) * nums[start]))) {// i-start is the multiplier for how many
																			// adjacent indices there are
			// and therefore have to all be chosen together or none chosen at all.
			return true;

		}

		return groupSumClump(i, nums, target);// no 'if statement' required because there are no more conditionals
												// afterwards resulting in the
		// false case to be the last case scenario.

	}

	public static boolean splitArray(int[] nums) {
		// base case for recursive function is where right side - left ==0 after all
		// indices chosen.
		// chose left or right for each element.
		return recursSum(0, 0, 0, nums);
	}

	public static boolean recursSum(int ind, int left, int right, int[] arrayToSplitSum) {
		if (ind >= arrayToSplitSum.length) {
			return (right - left) == 0; // base case
		}

		if (recursSum(ind + 1, left + arrayToSplitSum[ind], right, arrayToSplitSum)) {
			return true;
		}
		if (recursSum(ind + 1, left, right + arrayToSplitSum[ind], arrayToSplitSum)) {
			return true;
		}
		return false;
	}
}




