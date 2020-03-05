/*
@author lushuai
@date  2019/9/9-19:58
题目描述：
给定一个机器人，初始位置为（0,0） ，初始方向 为 北，机器人执行一段指令 S。
S 由三种命令组成 ，“G” （直走）、“L”（左转 90度）、 “R”（右转 90度）。
求若执行 S 若干次（1次或多次），机器人的轨迹是否为一个圆。
机器人按顺序执行指令instructions，并一直重复它们。
只有在平面中存在环使得机器人永远无法离开时，返回true。否则，返回false。

Input: "GGLLGG"
Output: true
*/
public class Leetcode1041 {
    public static void main(String[] args) {

    }
    public boolean isRobotBounded(String instructions){
        int x=0,y=0,curDir=0;
        //x,y代表坐标，curDir代表当时的方向，从0到3,0代表向上，1代表右，2代表向下，3代表向左
        //最多将这个字符串重复四次，就可以回到原位置，如果四次没有回来，就回不来了（因为每次最少旋转90度）
        for(int i=0;i<4;i++){
            for(int j=0;j<instructions.length();j++){
                char ch=instructions.charAt(j);
                if(ch=='G'){
                    x=curDir==1?x+1:(curDir==3?x-1:x);
                    y=curDir==0?y+1:(curDir==2?y-1:y);
                }
                else if (ch=='L')
                    curDir=curDir==0?3:curDir-1;
                else
                    curDir=curDir==3?0:curDir+1;
            }
        }
        return x==0&&y==0;
    }
}
