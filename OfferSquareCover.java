/*
@author lushuai
@date  2020/2/16-23:04
题目描述：
可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
*/
public class OfferSquareCover {
    public static void main(String[] args) {

    }
    public static int RectCover(int target){
        if(target==1) return 1;
        if(target==2) return 2;
        int res=0;
        int r1=1;
        int r2=2;
        for(int i=3;i<=target;i++){
            res=r1+r2;
            r1=r2;
            r2=res;
        }
        return res;
    }
}
