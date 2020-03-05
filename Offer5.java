/*
@author lushuai
@date  2020/2/8-17:52
剑指offer第5题：替换空格
*/
public class Offer5 {
    public static void main(String[] args) {
        String str = "We are happy.";
       // System.out.println(replaceSpace(str));
    }
    public static String replaceSpace(StringBuffer str){
        if(str==null)
            return null;
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            }else {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
}
