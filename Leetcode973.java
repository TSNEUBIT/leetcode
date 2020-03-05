
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
@author lushuai
@date  2020/2/23-17:57
题目描述：最接近原点的k个点
最小/大k值问题
*/
public class Leetcode973 {
    public static void main(String[] args) {
        int[][] points={{1,3},{-2,2}};
        System.out.println(points[0]);
    }
    public static int[][] kClosest(int[][] points, int K){
        Arrays.sort(points,(p1,p2)->p1[0]*p1[0]+p1[1]*p1[1]-p2[0]*p2[0]-p2[1]*p2[1]);//用lambda表达式实现了compator接口
        return Arrays.copyOfRange(points,0,K);
    }

    public static int[][] kClosest1(int[][] points, int K){
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]*o1[0]+o1[1]*o1[1]-o2[0]*o2[0]-o2[1]*o2[1];
            }
        });
        for(int i=0;i<points.length;i++){
            minHeap.add(points[i]);
        }
        int[][] res = new int[K][2];
        for(int i=0;i<K;i++){
            res[i]=minHeap.poll();
        }
        return res;
    }

}
