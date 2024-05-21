class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int x=i+1;x<nums.length;x++)
            {
                if(nums[i]+nums[x]==target)
                {
                    return new int[]{i,x};
                }
            }
        }

        return nums;
    }
}
/**
 * 1twosum
 */
public class twosum {
    public static void main(String[] args) {
        int[] num = {2,5,7,2};
        Solution s = new Solution();
        s.twoSum(num, 9);
    }
    
}