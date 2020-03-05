/*
@author lushuai
@date  2019/5/22-9:43

Two Sum II - Input array is sorted
给一个有序的整型数组和目标值target
思路：1.暴力解法，两重for循环，不太好，没使用数组有序的特点；2.有序数组，想到二分查找；3.对撞指针
*/
public class Leetcode167 {
    public static void main(String[] args){
        int[] numbers={2,7,11,15};
        int target=9;
        System.out.println(twoSum(numbers,target));

    }
    public static int[] twoSum(int[] numbers, int target){
        int l=0;
        int r=numbers.length-1;
        while (l<r)
        {
            if(numbers[l]+numbers[r]==target)
                break;
            else if(numbers[l]+numbers[r]>target)
                r--;
            else
            l++;
        }
        return new int[]{l,r};
    }
}
