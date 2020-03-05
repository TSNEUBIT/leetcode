/*
@author lushuai
@date  2019/6/1-17:19
反转整数
*/
public class Leetcode07 {
    public static void main(String[] args){
        System.out.println(reverse(321));
    }
    public static int reverse(int x){
        long res=0;
        while (x!=0)
        {
            res=res*10+x%10;
            if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)
                return 0;
            x=x/10;
        }
        return (int)res;
    }
}
