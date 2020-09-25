package leetcode;

import java.util.HashMap;

/**
 * @author klaus
 * @date 2020/9/25 10:33
 */
public class TwoSum {
    /**
     * 哈希法 空间O(n) 时间O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] TwoSum1(int[] nums,int target){
        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int sum=target- nums[i];
            if (map.containsKey(sum)&&map.get(sum)!=i){
                arr[0]=i;
                arr[1]=map.get(sum);
            }
        }
        return arr;
    }
    public int[] TwoSum2(int[] nums,int target){
        int[] arr=new int[2];
        return arr;
    }
}
