import java.util.Stack;

/*
@author lushuai
@date  2019/8/30-16:59
*/
public class Leetcode739 {
    public static void main(String[] args) {
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        for (int a : nums)
            System.out.print(a + ",");
        System.out.println('\n');
        for (int a : dailyTemperatures2(nums))
            System.out.print(a + ",");
    }

    public static int[] dailyTemperatures1(int[] T) {
        Stack<Integer> stack = new Stack<>(); //创建一个栈的对象
        int[] res = new int[T.length];        //创建一个存放结果的数组
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.push(i);
        }
        return res;
    }

    public static int[] dailyTemperatures2(int[] T) {
        int[] res = new int[T.length];
        res[T.length-1] = 0;    //最后一位肯定是0
        int i = T.length-2;
        while(i>=0){
            if(T[i]<T[i+1]){
                res[i] = 1;     //后一位比前一位大，肯定是1
                i--;
            }else{
                int j=i+1;
                while(res[j]!=0){
                    j+=res[j];
                    if(T[i]<T[j]){
                        res[i] = j-i;
                        break;  //跳出while循环
                    }
                }
                i--;
            }
        }
        return res;
    }
}
