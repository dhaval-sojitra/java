// problem : 26
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j > -1; j--) {
                if (nums[i] == nums[j]) {
                    k++;
                    break;
                }
            }
        }
        int[] temp = new int[k-1];
        int d = 0;
        boolean val = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j > -1; j--) {
                if (nums[i] == nums[j]) {
                    break;
                } else {
                    val = true;
                }
            }
            if (val == true) {
                temp[d] = nums[i];
                d++;
                val = false;
            }
        }
        for(int i=0;i<temp.length;i++)
        {
            return temp[i];
        }
    }
}

public class duplicate {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        Solution s = new Solution();
        s.removeDuplicates(nums);
    }
}
