import java.util.Comparator;
import java.util.PriorityQueue;

/*
@author lushuai
@date  2020/2/23-19:54
*/
public class TestPriorityQueue {
    //自定义比较器，降序排列
    static Comparator<Integer> cmp = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    };
    public static void main(String[] args) {
        //不用比较器，默认升序排列
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(2);
        queue.add(4);
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
        //使用自定义的比较器，降序排列
        PriorityQueue<Integer> queue1 = new PriorityQueue<>(cmp);
        queue1.add(3);
        queue1.add(2);
        queue1.add(4);
        while (!queue1.isEmpty()){
            System.out.print(queue1.poll()+" ");
        }
    }
}
