/*
@author lushuai
@date  2020/2/18-14:12
题目描述：
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
保证base和exponent不同时为0
*/
public class Offer16 {
    public static void main(String[] args) {
        System.out.println(Power1(2,4));
    }
    public static double Power1(double base, int exponent){
        double res=1;
        if(exponent>0){
            for(int i=1;i<=exponent;i++){
                res*=base;
            }
            return res;
        }else if(exponent<0){
            for(int i=1;i<=(-exponent);i++){
                res*=base;
            }
            return 1/res;
        }
        return res;
    }


}
