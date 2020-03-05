import java.util.HashMap;
import java.util.Map;

/*
@author lushuai
@date  2020/2/24-23:35
参考：
https://blog.csdn.net/kyi_zhu123/article/details/52769469?depth_1-utm_source=distribute.pc_relevant.none-task&utm_source=distribute.pc_relevant.none-task
*/
public class TestMapentry {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        //通过Map.entrySet遍历key和value
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+" value="+entry.getValue());
        }
    }
}
