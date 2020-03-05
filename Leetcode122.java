/*
@author lushuai
@date  2020/3/2-23:03
*/
public class Leetcode122 {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices){
        int res=0;
        int tem=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                tem=prices[i+1]-prices[i];
                res+=tem;
            }
        }
        return res;
    }
}
