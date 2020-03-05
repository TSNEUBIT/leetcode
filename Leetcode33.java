/*
@author lushuai
@date  2019/6/1-9:30
tag：二分查找。
在旋转数组中寻找目标元素
要求的时间复杂度是O(logn)级别，第一反应就是二分查找。数组有序也在提示用二分查找
*/
public class Leetcode33 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int targrt = 4;
        System.out.println(search(nums, 5));

    }

    public static int search(int[] nums, int target) {
        if (nums.length < 1)
            return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;    //防止mid越界
            //二分查找的题目可以常用这么写边界条件
            if (nums[mid] == target)
                return mid;
            else if (nums[left] == target)
                return left;
            else if (nums[right] == target)
                return right;
            else {
                if (target > nums[mid]) {
                    //之前思路有点错误，确定范围时，用nums[0]nums[nums.length-1]作界限
                    if (nums[mid] > nums[0])
                        left = mid + 1;
                    else {
                        if (target > nums[0])
                            right = mid - 1;
                        else
                        left = mid + 1;
                    }
                }
                else  {
                    if (target > nums[0])
                        right = mid - 1;
                    else {
                        if (nums[mid] >nums[0])
                            left = mid + 1;
                        else
                        right = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
