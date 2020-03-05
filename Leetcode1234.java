/*
@author lushuai
@date  2019/10/23-17:20
*/
public class Leetcode1234 {
    public static void main(String[] args) {
        String s="QQQQWWWW";
        System.out.println(balancedString("WWEQERQWQWWRWWERQWEQ"));
    }
    public static int balancedString(String s){
        int[] nums={0,0,0,0};
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='Q') nums[0]++;
            if(s.charAt(i)=='W') nums[1]++;
            if(s.charAt(i)=='E') nums[2]++;
            if(s.charAt(i)=='R') nums[3]++;
        }
        int min=Math.min(nums[0],Math.min(nums[1],Math.min(nums[2],nums[3])));
        int[] cur=new int[4];
        for(int i=0;i<4;i++){
            cur[i]=nums[i]-min;
        }
        int sum=cur[0]+cur[1]+cur[2]+cur[3];
        int avr=sum/4;
        int n=0;
        for(int i=0;i<4;i++){
            if(cur[i]>avr){
                n+=cur[i]-avr;
            }
        }
        return n;
    }
}
