/*
@author lushuai
@date  2019/12/10-21:17
找出数组中的重复数字
*/
public class Offer3 {
    public static void main(String[] args) {
        int[] nums={2,3,1,0,2,5,3};
        int[] dup={0,0};
        System.out.println(duplicate(nums,nums.length,dup));
    }


    public static boolean duplicate(int numbers[],int length,int [] duplication){
        if(length==0) return false;
        for(int i=0;i<length;i++){
            while (i!=numbers[i]){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0]=numbers[i];
                    return true;
                }else {
                //交换numbers[i]和numbers[numbers[i]]
                int tem=numbers[i];
                numbers[i]=numbers[tem];
                numbers[tem]=tem;
            }
        }
    }
    return false;

    }


}
