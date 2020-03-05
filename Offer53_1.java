/*
@author lushuai
@date  2020/3/1-20:17
*/
public class Offer53_1 {
    public static void main(String[] args) {
        int[] nums={1,1,3,3,3,3,3};
        System.out.println(GetNumberOfK2(nums,3));
        System.out.println(getFirstK(nums,3));
    }
    public static int GetNumberOfK(int [] array , int k){
        int l=0;
        int r=array.length-1;
        int mid=0;
        if(array[l]>k) return 0;
        if(array[r]<k) return 0;
        while (l<r){
             mid=(r-l)/2+l;
            if(array[mid]<k){
                mid++;
            }else if(array[mid]>k){
                mid--;
            }else {
                break;
            }
        }
        if(array[mid]==k){
            int count1=1;
            int count2=1;
            while((mid+count1)<array.length&&array[mid]==array[mid+count1]){
                count1++;
            }
            while((mid-count2)>=0&&array[mid]==array[mid-count2]){
                count2++;
            }
            return count1+count2-1;
        }
        return 0;
    }
    public static int GetNumberOfK1(int [] array , int k){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==k){
                count++;
            }
        }
        return count;
    }

    public static int GetNumberOfK2(int [] array , int k){
        int fk=getFirstK(array,k);
        int lk=getLastK(array,k);
        if(fk!=0&&lk!=0){
            return lk+fk-1;
        }
        return 0;
    }
    //在含有重复出现元素的数组中寻找第一次出现的下标
    static int getFirstK(int[] array,int k){
        int l=0;
        int r=array.length-1;
        int mid=0;
        while (l<r){
            mid=(l+r)/2-l;
           if(array[mid]<k){
               l=mid+1;
           }else if(array[mid]>=k){
               r=mid;
           }
           return l;
        }
        return 0;
    }
    static int getLastK(int[] array,int k){
        int l=0;
        int r=array.length-1;
        int mid=0;
        while (l<r){
            mid=(l+r)/2-l;
            if(array[mid]>k){
                r=mid-1;
            }else if(array[mid]<=k){
                l=mid;
            }
            return r;
        }
        return 0;
    }
}
