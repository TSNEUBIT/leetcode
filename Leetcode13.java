import java.util.HashMap;

/*
@author lushuai
@date  2019/9/5-15:22
hashmap的典型应用了，要熟悉集合类的api
这个遍历里面的逻辑也很简单，就是罗马数字的逻辑
*/
public class Leetcode13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }
    public static int romanToInt(String s){
       if(s==null||s.length()==0) return -1;
       HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len=s.length();
        int res=map.get(s.charAt(len-1));
        for(int i=len-2;i>=0;i--){
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                res += map.get(s.charAt(i));
            else
                res -= map.get(s.charAt(i));
        }
        return res;
    }
}
