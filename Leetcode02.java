import java.util.HashMap;
import java.util.Map;

/*
@author lushuai
@date  2019/4/23-19:22
*/
public class Leetcode02 {
    public static void main(String[] args) {
        String s = ("abcabcbb");
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
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
}

