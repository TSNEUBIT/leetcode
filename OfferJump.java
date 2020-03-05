/*
@author lushuai
@date  2020/2/15-19:17
*/
public class OfferJump {
    public static void main(String[] args) {

    }
    public static int JumpFloor(int target){
        if(target==1) return 1;
        if(target==2) return 2;
        int r1=1;
        int r2=2;
        int res=0;
        for(int i=3;i<=target;i++){
            res=r1+r2;
            r1=r2;
            r2=res;
        }
        return res;
    }
}
