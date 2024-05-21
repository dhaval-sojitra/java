class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0, c = 0;
        boolean val = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(s.charAt(i)==s.charAt(j))
                {
                    if(c<count)
                    {
                        c = count;
                    }
                    count = 0;
                }                
            }           
            count += 1;
        }
        if(c>count)
        {
            return c;
        }
        else
        {
            return count;
        }
    }
}

class substring {
    public static void main(String[] args) {
        String a = "watermelon";
        Solution s = new Solution();
        System.err.println( s.lengthOfLongestSubstring(a));
    }
}