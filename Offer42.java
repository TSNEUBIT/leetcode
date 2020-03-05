import java.util.Arrays;

/*
@author lushuai
@date  2020/2/24-16:53
题目描述：
连续子数组的最大和
*/
public class Offer42 {
    public static void main(String[] args) {
        int[] nums={1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(nums));
        System.out.println(FindGreatestSumOfSubArray1(nums));
    }
    public static int FindGreatestSumOfSubArray(int[] array){
        if(array.length==1) return array[0];
        int[] dp=new int[array.length+1];
        dp[0]=array[0];
        int res=0;
        for(int i=1;i<array.length;i++){
            if(dp[i-1]>0){
                dp[i]=dp[i-1]+array[i];
            }else {
                dp[i]=array[i];
            }
            res=Math.max(res,dp[i]);
        }
        if(res>0){
            return res;
        }else {
            Arrays.sort(array);
            return array[array.length-1];
        }
    }

    public static int FindGreatestSumOfSubArray1(int[] array){
        int res=array[0];//最后结果
        int max=array[0];//以每一个元素结尾的最大值
        for(int i=1;i<array.length;i++){
            max=Math.max(array[i],max+array[i]);
            res=Math.max(res,max);
        }
            return res;
    }

}
