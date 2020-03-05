/*
@author lushuai
@date  2019/5/29-17:46
盛雨水问题，tag:栈或者对撞指针
栈的方法还不太理解，先把对撞指针的方法写出来了
*/
public class Leetcode42 {
    public static void main(String[] args){
        int[] height={0,5,0,2,1,0,1,4,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height){
        int sum=0;
        int left=0;
        int right=height.length-1;
        int maxl=0;
        int maxr=0;
        while (left<right){
            if(height[left]<=height[right]){
                if(height[left]<maxl){
                    sum=sum+maxl-height[left];  //记录一格水
                }else{
                    maxl=height[left];
                }
                left++;
            }else{
                if(height[right]<maxr){
                    sum=sum+maxr-height[right];
                }else{
                    maxr=height[right];
                }
                right--;
            }
        }
        return sum;
    }
}
