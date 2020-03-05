/*
@author lushuai
@date  2020/2/16-23:26
*/
public class Offer14 {
    public static void main(String[] args) {
        System.out.println(cutRope(4));
    }
    public static int cutRope(int target){
        //下面3行是n<4时的具体情况
        if(target<2) return 0;
        if(target==2) return 1;
        if(target==3) return 2;
        //在绳子长度大于3时，这三种情况不分为大
        int[] dp=new int[target+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        int res=0;
        for(int i=4;i<=target;i++){
            for(int j=1;j<=i/2;j++){            //注意这里取的到等号
                res=Math.max(res,dp[j]*dp[i-j]);
            }
        }
        return res;
    }
}
