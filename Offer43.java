/*
@author lushuai
@date  2020/2/24-17:51
*/
public class Offer43 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(12));
    }

    public static int NumberOf1Between1AndN_Solution(int n){
        int res=0;
        for(int i=0;i<=n;i++){
            res=res+NumberOf1(i);
        }

        return res;
    }
    static int NumberOf1(int n){
        int count=0;
        while (n!=0){
            if(n%10==1){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
