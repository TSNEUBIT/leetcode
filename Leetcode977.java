import java.util.Arrays;

/*
@author lushuai
@date  2020/3/2-22:36
题目描述：有序数组的平方
*/
public class Leetcode977 {
    public static void main(String[] args) {

    }
    public static int[] sortedSquares(int[] A){
        int[] res=new int[A.length];
        for(int i=0;i<A.length;i++){
            res[i]=A[i]*A[i];
        }
        Arrays.sort(res);
        return res;
    }
}
