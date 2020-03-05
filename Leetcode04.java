/*
@author lushuai
@date  2019/5/18-11:29
*/
public class Leetcode04 {
    public static void main(String[] args){
        int[] nums1={1,2};
        int[] nums2={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1,int[] nums2){
        int l1=nums1.length;
        int l2=nums2.length;

        int mid=(l1+l2)/2;
        int[] arr=new int[mid+1];
        int j=0,k=0;
        for(int i=0;i<mid+1;i++)
        {
            if(j<l1&&(k>=l2)||nums1[j]<nums2[k]){
                arr[i]=nums1[j];
                        j++;
            }
            else{
                arr[i]=nums2[k];
                k++;
            }
        }
        if((l1+l2)%2!=0)
            return (double)arr[mid];
        else
            return (double)(arr[mid-1]+arr[mid])/2;
    }
}
