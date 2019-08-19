package Binary_Search_3;
//https://www.lintcode.com/problem/last-position-of-target/description?_from=ladder&&fromId=1

public class Last_Position_of_Target {
    public class Solution {
        /**
         * @param nums: An integer array sorted in ascending order
         * @param target: An integer
         * @return: An integer
         */
        public int lastPosition(int[] nums, int target) {
            // write your code here
            if(nums ==null || nums.length == 0) {
                return -1;
            }

            int start = 0;
            int end = nums.length - 1;
            int mid;
            while (start + 1 < end) {
                mid = (start + end)/2;
                if (nums[mid] <= target) {
                    start = mid;
                } else {
                    end = mid;
                }
            }

            if (nums[end] == target) {
                return end;
            }
            if (nums[start] == target) {
                return start;
            }

            return -1;
        }
    }
}