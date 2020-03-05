/*
@author lushuai
@date  2019/10/17-20:59
题目描述：按奇偶性对数组排序，一个数组，一半奇数，一半偶数，排序后使奇数下标位置的是奇数，偶数下标位置的是偶数
*/
public class Leetcode922 {

    public static void main(String[] args) {
        int[] nums={4,1,5,2};
        int[] a=sortArrayByParityII2(nums);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static int[] sortArrayByParityII1(int[] A){
        for(int i=0;i<A.length;i+=2){
            if(A[i]%2==1){
                for(int j=1;j<A.length;j+=2){
                    if(A[j]%2==0){
                        int tem=A[i];
                        A[i]=A[j];
                        A[j]=tem;
                    }
                }
            }
        }
        return A;
    }
    public static int[] sortArrayByParityII2(int[] A){
        int e=0,o=1;
        while (e<A.length&&o<A.length){
            if(A[e]%2==1){
                int tem=A[e];
                A[e]=A[o];
                A[o]=tem;
                o=o+2;
            }else {
                e=e+2;
            }
        }
        return A;
    }

}
