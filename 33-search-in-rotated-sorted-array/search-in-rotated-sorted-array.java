class Solution {
    static int findPivotIndex(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        if (n == 1 || nums[s] < nums[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid < n - 1 && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (nums[mid] >= nums[s]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int pivotIndex = findPivotIndex(nums);
        int n = nums.length;

        if (pivotIndex == -1) {
            return binarySearch(nums, 0, n - 1, target);
        }

        int startArray1 = 0;
        int endArray1 = pivotIndex;

        if (target >= nums[startArray1] && target <= nums[endArray1]) {
            return binarySearch(nums, startArray1, endArray1, target);
        }

        int startArray2 = pivotIndex + 1;
        int endArray2 = n - 1;

        if (startArray2 < n && target >= nums[startArray2] && target <= nums[endArray2]) {
            return binarySearch(nums, startArray2, endArray2, target);
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna