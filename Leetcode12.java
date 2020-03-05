/*
@author lushuai
@date  2019/9/5-11:16
整数转罗马数字
题目描述：
例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。
但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900

示例 1:

输入: 3
输出: "III"
示例 2:

输入: 4
输出: "IV"
示例 3:

输入: 9
输出: "IX"
示例 4:

输入: 58
输出: "LVIII"
解释: C = 100, L = 50, XXX = 30, III = 3.
示例 5:

输入: 1994
输出: "MCMXCIV"
解释: M = 1000, CM = 900, XC = 90, IV = 4.

给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
*/
public class Leetcode12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3999));
    }
    public static String intToRoman(int num){
        String M[]={"","M","MM","MMM"};
        String C[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String X[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String I[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[num%10];
    }
}