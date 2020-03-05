/*
@author lushuai
@date  2020/2/25-16:11
题目描述：
把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
*/
public class Offer49 {
    public static void main(String[] args) {

    }
    public static int GetUglyNumber_Solution(int index){
        int number=0;
      if(index<=0) return 0;
      int uglyfound=0;
      while (uglyfound<index){
          number++;
          if(judgeUglyNumber(number)){
              uglyfound++;
          }
      }
      return number;
    }

    static boolean judgeUglyNumber(int n){
        while (n%2==0){
            n/=2;
        }
        while (n%3==0){
            n/=3;
        }
        while (n%5==0){
            n/=5;
        }
        return (n==1)?true:false;
    }
}
