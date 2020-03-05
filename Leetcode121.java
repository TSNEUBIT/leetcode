/*
@author lushuai
@date  2019/6/5-22:29
买卖股票的最佳时机
tag：数组
*/
public class Leetcode121 {
    public static void main(String[] args){

    }
    public static  int maxProfit(int[] prices){
        if(prices==null||prices.length==0)
            return 0;
        int min=prices[0];
        int res=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>min)
                res=Math.max(res,prices[i]-min);
            else
                min=prices[i];
        }
        return res;
    }
}
