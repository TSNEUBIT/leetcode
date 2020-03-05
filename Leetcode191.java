/*
@author lushuai
@date  2019/12/10-20:16
计算二进制中1的个数
*/
public class Leetcode191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight1(10));
    }
    public static int hammingWeight1(int n){
        int count=0;
        for(int i=0;i<32;i++){
            count=count+((n>>i&1)==1?1:0);
        }
        return count;
    }
    public static int hammingWeight2(int n){
        int count=0;
        while (n!=0){
            count++;
            n=n&(n-1);//减1之后，最右边的那个1变成0，后边的0（如果有的话）变成1，与运算最右边的1和后边的0都变0了
        }
        return count;
    }
}
