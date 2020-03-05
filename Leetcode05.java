/*
@author lushuai
@date  2019/5/20-16:06
最长回文子串：1.暴力解法。2.动态规划
妈的，暴力解法竟然有错误，学习一下动态规划
*/
public class Leetcode05 {
    public static void main(String[] args){
        String s1=("babad");
        System.out.println(s1);
        String s2=("bb");
        System.out.println(longestPalindrome2(s1));
        System.out.println(longestPalindrome2(s2));
    }
    public static String longestPalindrome1(String s) {
        if(s.length()==0){
            return s;
        }
        String res=s.substring(0,1);
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                String k=s.substring(i,j);
                String rk=new StringBuffer(k).reverse().toString();
                if(k.equals(rk)&&k.length()>res.length())
                    res=k;
            }
        }
        return res;
    }

    public static String longestPalindrome2(String s){
        if(s.length()<=1)
            return s;
        int n=s.length();

        //boolean[i][j]等于ture表示子串i-j为回文串
        boolean[][] dp=new boolean[n][n];
        int start=0;                    //回文起始处
        int maxlen=0;                   //回文子串长度
        for(int i=0;i<n;i++)
        {
            dp[i][i]=true;
            if(i<n-1&&s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                start=i;
                maxlen=2;
            }
        }

        //m代表回文子串长度，从3开始
        for(int m=3;m<=n;m++)
        {
            for(int i=0;i<=n-m;i++)
            {
                //依次比较是否满足状态转移方程
                int j=i+m-1;
                if(dp[i+1][j-1]&&s.charAt(i)==s.charAt(j)){
                    dp[i][j]=true;
                    start=i;
                    maxlen=m;
                }
            }
        }
        //如果存在回文子字符串
        if(maxlen>=2)
            return s.substring(start,start+maxlen);
        //不存在则返回null
        return null;


    }
}
