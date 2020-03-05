/*
@author lushuai
@date  2019/9/9-23:15
https://blog.csdn.net/qq_27480345/article/details/89462513
*/
public class Leetcode983 {
    public static void main(String[] args) {

    }
    public static int mincostTickets(int[] days, int[] costs){
        int[] ans=new int[366];
        int index=0;
        for(int i=1;i<=365;i++){
            if(i!=days[index])
                ans[i]=ans[i-1];
            else {
                int pay1=ans[i-1]+costs[0];
                int pay7=i>=7?ans[i-7]+costs[1]:costs[1];
                int pay30=i>=30?ans[i-30]+costs[2]:costs[2];
                ans[i]=Math.min(pay1,Math.min(pay7,pay30));
                index++;
                if(index>=days.length)
                    break;
            }
        }
        return ans[days[days.length-1]];
    }
}
