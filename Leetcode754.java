/*
@author lushuai
@date  2019/7/12-10:55
题目描述：在一根无限长的数轴上，你站在0的位置。终点在target的位置。
每次你可以选择向左或向右移动。第 n 次移动（从 1 开始），可以走 n 步。
返回到达终点需要的最小移动次数。
思路：如果target等于n(n+1)/2时，n步一直往前走；
如果target大于n(n+1)/2，那么n还要再变大
如果target小于n(n+1)/2，
如果n(n+1)/2-target是偶数的话，让第[n(n+1)/2-target]/2向左走，n步也可以完成
如果n(n+1)/2-target是奇数的话，如果n为偶数，那么n+1是奇数，和前面的数可以凑出来，是n+1步
如果n为奇数，那么n+1是偶数，凑不出来，要n+2
*/
public class Leetcode754 {
    public static void main(String[] args){

    }
    public int reachNumber(int target){
        int res=Math.abs(target);
        int n=0;
        while (res>n*(n+1)/2) {
            n++;
        }
            if(n*(n+1)/2==res)
                return n;
            else {
                if((n*(n+1)/2-res)%2==0)
                    return n;
                else {
                    if(n%2==0)
                        return n+1;
                    else
                        return n+2;
                }
            }
    }
}
