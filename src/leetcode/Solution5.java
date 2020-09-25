package leetcode;

/**
 * @author klaus
 * @date 2020/9/25 14:53
 */
public class Solution5 {
    public String longestPalindrome(String s){
        if (s.length()==0) return "";
        return "";
    }
    public boolean isReverse(String s){
        int left=0;
        int right=s.length()-1;
        boolean isTrue=false;
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
