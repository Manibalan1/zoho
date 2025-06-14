public class RotatedSearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (high + low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return nums[mid];
    }
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2 , 3, 4, 5 ,9, 15};
        int target = 8;

        int result = search(numbers, target);
        System.out.println(result);
    }
}