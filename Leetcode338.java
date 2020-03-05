/*
@author lushuai
@date  2019/7/9-17:13
*/
public class Leetcode338 {
    public static void main(String[] args){
        System.out.println(countBits1(5));
    }
    public static int[] countBits1(int num){
        int[] result = new int[num+1];
        result[0]=0;
        //result[1]=1;
        for(int i=1;i<result.length;i++)
        {
            result[i]=result[i&(i-1)]+1;
        }
        return result;
    }
    public static int[] countBits2(int num){
        int[] result = new int[num+1];
        result[0]=0;
        //result[1]=1;
        for(int i=0;i<result.length;i++)
        {
            result[i]=result[i/2]+i%2;
        }
        return result;
    }

}
