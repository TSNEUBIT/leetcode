import java.util.HashMap;

/*
@author lushuai
@date  2020/2/25-17:44
题目描述：
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写
*/
public class Offer50_1 {
    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("abaccdeff"));
    }
    public static int FirstNotRepeatingChar(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i=0;i<str.length();i++){
           char c = str.charAt(i);
           if(map.get(c)==1){
               return i;
           }
        }
        return -1;
    }

}
