/*
@author lushuai
@date  2019/5/20-22:34
妈的，写了一天leetcode第五题，做一道简单一点的缓解一下
题目描述：盛水最多的容器

参照这Leetcode 125:验证回文串、Leetcode 344:验证回文串
Leetcode 167:两数之和 II - 输入有序数组、Leetcode 345:反转字符串中的元音字母几篇文章中的解题思路。
我们通过设置两个指针，分别指向数组的头l和尾r，计算容器可以容纳多少水contain。我们知道想要容纳的水最多，最好的情况是l和r都是最大，然后二者离的最远，但是这是理想情况，我们最一般的情况是

二者离的足够远，但是二者都不是很大
二者都很大，但是二者离的近

*/
public class Leetcode11 {
    public static void main(String[] args){
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height){
        int left=0;
        int right=height.length-1;
        int res=0;
        while (left!=right)
        {
            int area=(right-left)*Math.min(height[left],height[right]);
            res=Math.max(res,area);
            if(height[left]<height[right])
                left++;
            else
                right--;

        }
        return res;

    }
}
