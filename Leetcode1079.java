/*
@author lushuai
@date  2019/9/26-14:57
题目描述：
你有一套活字字模 tiles，其中每个字模上都刻有一个字母 tiles[i]。返回你可以印出的非空字母序列的数目。

*/
public class Leetcode1079 {
    public static void main(String[] args) {
        String tiles="AAB";
        System.out.println(numTilePossibilities(tiles));
    }
    public static int numTilePossibilities(String tiles){
        //先遍历一遍titles，记录26个字母分别有几个
        int[] record=new int[26];
        for(char a:tiles.toCharArray()){
            record[a-'A']++;
        }
        return dfs(record);
    }
    public static int dfs(int[] record){
        int sum=0;
        for(int i=0;i<26;i++){
            if(record[i]==0) continue;
            record[i]--;
            sum++;
            sum+=dfs(record);
            record[i]++;
        }
        return sum;
    }
}
