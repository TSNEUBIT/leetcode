import java.util.Arrays;

/*
@author lushuai
@date  2020/2/18-15:04
题目描述：
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
*/
public class Offer39 {
    public static void main(String[] args) {
        int[] nums={1,2,3,2,4,2,5,2,3};
        System.out.println(MoreThanHalfNum_Solution(nums));
    }
    public static int MoreThanHalfNum_Solution(int [] array){
        Arrays.sort(array);
        int k=array.length/2;
        int count=0;
        for (int i=0;i<array.length;i++){
            if(array[i]==array[k]){
                count++;
            }
        }
        if(count>k) return array[k];
        return 0;
    }

      //如果不能修改输入的数组，即不能对数组排序,写一个检查出现最多的数字是否过半的函数
    public static int MoreThanHalfNum_Solution1(int [] array){
        int res=array[0];
        int count=1;
        for(int i=0;i<array.length;i++){
            if(count==0){
                res=array[i];
                count=1;
            }
            else if(res==array[i]){
                count++;
            }else
                count--;
        }
        if(CheckMoreThanHalf(array,array.length,res)) return res;
        return 0;
    }
   static boolean CheckMoreThanHalf(int[] array,int length,int res){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(res==array[i]){
                count++;
            }
        }
        if(count*2>length) return true;
        return false;
    }

}
