package leetcode;

/**
 * @author klaus
 * @date 2020/9/25 14:53
 */
public class Solution5 {
    public String longestPalindrome(String s){
        if (s.length()==0) return "";
        int[] range=new int[2];
        char[] ch=s.toCharArray();
        return "";
    }
    public static int findLongest(char[] str,int low,int[] range){
        int high=low;
        while (high<str.length&&str[high+1]==str[low]){
            high++;
        }
        int ans=high;
        return 0;
        //while ()
    }
}
