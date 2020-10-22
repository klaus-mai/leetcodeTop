package leetcode;

import java.util.Arrays;

/**
 * @author klaus
 * @date 2020/10/8 12:49
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.climbStairs(3));
    }

    /**
     * 最小K个数
     */
    public int[] smallestK(int[] arr,int k){
        int[] nums=new int[k];
        if (arr.length<2) return nums;
        return nums;
    }
    public static void quickSort(int[] arr,int startIndex,int endIndex){
        int i=startIndex;
        int j=endIndex;
        while (i<j){
            //if (arr[])
        }
    }
    /**
     * 爬楼梯
     */
    public static int climbStairs(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i < n+1; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public int coinChange(int[] coins,int count){
        int n=coins.length;
        int[] dp=new int[count+1];
        return dp[n];
    }
}
