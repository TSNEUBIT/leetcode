import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
@author lushuai
@date  2019/5/16-19:19
*/
public class Leetcode03 {
    public static void main(String[] args) {
        String s = ("abcabcbb");
        System.out.println(lengthOfLongestSubstring1(s));
        System.out.println(lengthOfLongestSubstring2(s));
    }

    public static int lengthOfLongestSubstring1(String s) {
        if(s.length()==0||s==null)
            return 0;

        Map<Character, Integer> map = new HashMap<>();
        int res=0;
        for(int i=0,j=0;i<s.length();i++)
        {
            Character ch=s.charAt(i);			//获取字符串中指定位置的字符
            if(map.containsKey(ch))				//如果出现重复的字母
            {
                j=Math.max(j, map.get(ch)+1);	//在一次循环中，第一次出现重复时，等于后者。
                                                //不是第一次重复时，两者之间大的那个值赋给j
            }
            map.put(ch, i);						//无论什么情况，都把字母和序号放进map中
            res=Math.max(res, i-j+1);			//一步一步推导，注意理解i-j+1
        }

        return res;
    }

    public static int lengthOfLongestSubstring2(String s){
        int i=0,j=0,res=0;
        Set<Character> set = new HashSet<>();
        while (j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                res=Math.max(res,set.size());
            }else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return res;
    }
}



