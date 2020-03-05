/*
@author lushuai
@date  2019/10/23-9:29
*/
public class Leetcode1232 {
    public static void main(String[] args) {
        int[][] coordinates={{1,2},{2,3},{3,4},{4,5},{5,6}};
        System.out.println(coordinates[0][1]);
    }
    public static boolean checkStraightLine(int[][] coordinates){
        if(coordinates.length<2) return false;
        int x1=coordinates[0][0],y1=coordinates[0][1],x2=coordinates[1][0],y2=coordinates[1][1];
        for(int i=2;i<coordinates.length;i++){
            if ((y2-y1)*(coordinates[i][0]-x1)!=(coordinates[i][1]-y1)*(x2-x1))
                return false;
        }
        return true;
    }
}
