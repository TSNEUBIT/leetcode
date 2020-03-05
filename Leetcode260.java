/*
@author lushuai
@date  2019/9/16-14:58
题目描述：给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
示例 :

输入:
[1,2,1,3,2,5]

输出:
[3,5]
注意：

1.结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。
2.你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？

好题目，常数的空间复杂度不容易做到，如果是线性的空间复杂度的话，即O(n)，可以用哈希表来做，存进去，看看哪两个数字只出现了一次。
O（1）的空间的话，异或操作可行。

参考链接：
https://blog.csdn.net/qq_38595487/article/details/81163737
https://segmentfault.com/a/1190000004886431
*/
public class Leetcode260 {
    public static void main(String[] args) {
        int[] nums={1,2,1,3,2,5};
        int[] n=singleNumber(nums);
        for(int num:n){
            System.out.println(num);
        }
    }
    public static int[] singleNumber(int[] nums){
        int axorb=0;
        for(int num:nums){
            axorb^=num;
        }
        //设定标志位
        int flag=axorb&(~(axorb-1));
        //创建存放结果的数组
        int[] res=new int[2];
        for(int num:nums){
            if((num&flag)==0)
                res[0]^=num;
            else res[1]^=num;
        }
        return res;
    }
}
