package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author klaus
 * @date 2020/10/20 10:04
 */
public class Solution15 {
    /**
     * 三数
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        if (nums==null||nums.length<3) return lists;
        Arrays.sort(nums);
        if (nums[0]>0) return lists;
        for (int i = 0; i < nums.length-2; i++) {
             if(i>0 && nums[i]==nums[i-1]) {
                 continue;
             }
             int left=i+1;
             int right= nums.length-1;
             while (left<right) {
                 int sum=nums[i]+nums[left]+nums[right];
                 if (sum==0) {
                     List<Integer> temp = new ArrayList<>();
                     temp.add(nums[i]);
                     temp.add(nums[left]);
                     temp.add(nums[right]);
                     lists.add(temp);
                     while (left<right && nums[left]==nums[left+1]) {
                         left++;
                     }
                     while (left < right && nums[right] == nums[right - 1]) {
                         right--;
                     }
                     left++;
                     right--;
                 } else if (sum>0){
                     right--;
                 } else {
                     left--;
                 }
             }
        }
        return lists;
    }
}
