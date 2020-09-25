package leetcode;

/**
 * @author klaus
 * @date 2020/9/25 13:46
 */
public class Solution3 {
    public static void main(String[] args) {
        System.out.println(Solution3.lengthOfLongestSubstring("abcaa"));
    }
    public static int lengthOfLongestSubstring(String s){
        if (s.length()<2) return 0;
        boolean[] used=new boolean[128];
        int maxLen=0;
        int left=0,right=0;
        int n=s.length();
        while (right<n){
                if (!used[s.charAt(right)]){
                    used[s.charAt(right)]=true;
                    right++;
                }else {
                    maxLen=Math.max(maxLen,right-left);
                    while (left<right&&s.charAt(right)!=s.charAt(left)){
                        used[s.charAt(left)]=false;
                        left++;
                    }
                    left++;
                    right++;
                }
            }
        maxLen=Math.max(maxLen,right-left);
        return maxLen;
    }
}
