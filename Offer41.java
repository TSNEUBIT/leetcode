import java.util.Comparator;
import java.util.PriorityQueue;

/*
@author lushuai
@date  2020/2/24-15:11
题目描述：
如何得到一个数据流中的中位数？
如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。

参考链接：
https://www.nowcoder.com/questionTerminal/9be0172896bd43948f8a32fb954e1be1?f=discussion
*/

//麻痹的没跑通，空指针异常
public class Offer41 {
    //小顶堆，默认的优先队列
   private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    //大顶堆，重写compare方法
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(15,new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
    //记录偶数个还是奇数个
    int count=0;
    public void Insert(Integer num){
        if(count%2==0){
            //count偶数时，比如第一个，插入大顶堆，大顶堆的最大数，拿出来放进小顶堆
            maxHeap.offer(num);
            int max=maxHeap.poll();
            minHeap.offer(max);
        }else {
           //count奇数时，比如第二个，插入小顶堆，小顶堆的最小数，拿出来放进大顶堆
            minHeap.offer(num);
            int min=minHeap.poll();
            minHeap.offer(min);
        }
        count++;
    }

    public Double GetMedian(){
        //count为偶数，元素总数为偶数
        if(count%2==0){
            return new Double((minHeap.peek()+maxHeap.peek())/2);
        //count为奇数时，元素总数也为奇数，第一次插入后，小顶堆里有数
        }else {
            return new Double(minHeap.peek());
        }

    }

}
