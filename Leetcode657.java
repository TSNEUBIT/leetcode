/*
@author lushuai
@date  2019/9/5-16:05
判断路线成圈
题目描述：
初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，判断这个机器人的移动路线是否形成一个圆圈，换言之就是判断它是否会移回到原来的位置。
移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。机器人有效的动作有 R（右），L（左），U（上）和 D（下）。
输出应为 true 或 false，表示机器人移动路线是否成圈。

*/
public class Leetcode657 {
    public static void main(String[] args) {

    }
    public static boolean judgeCircle(String moves){
        if(moves.length()%2==1) return false;
        int x=0,y=0;
        char[] move=moves.toCharArray();
        for(char i:move){
            if(i=='U') y++;
            else if(i=='D') y--;
            else if(i=='L') x++;
            else if(i=='R') x--;
        }
        return x==0&&y==0;
    }
}
