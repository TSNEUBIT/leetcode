import java.util.ArrayDeque;

/*
@author lushuai
@date  2019/5/29-16:15
tag：stack（栈的应用）。
背景知识：在Java中Vector类派生了Stack的子类，模拟栈这种数据结构，这是一个很古老的Java集合类，线程安全，性能很差
所以平常经常使用ArrayQeque，代表一个双端队列，也可以当做栈来使用，因为其中也有pop，push两个方法。
tips:和栈有关，以及和对称性有关的

*/
public class Leetcode20 {
    public static void main(String[] args){
        String s=("{[()]}");
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        if(s.length()%2==1)
            return false;
        ArrayDeque<String> arr=new ArrayDeque<>();
        for(int i=0;i<s.length();i++)
        {
            switch (s.charAt(i)){
                case'{':arr.push("{");break;
                case'[':arr.push("[");break;
                case'(':arr.push("(");break;
                case'}':
                    if(arr.isEmpty()||arr.pop()!="{")
                        return false;
                    break;
                case']':
                    if(arr.isEmpty()||arr.pop()!="[")
                        return false;
                    break;
                case')':
                    if (arr.isEmpty()||arr.pop()!="(")
                        return false;
                    break;
            }
        }
        return arr.isEmpty();   //注意返回值的技巧
    }
}
