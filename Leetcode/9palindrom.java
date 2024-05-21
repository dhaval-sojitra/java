class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,val=0,num=0;
                 
        
        while(temp!=0)
        {
            val=temp%10;
            num = num*10+val;
            temp /= 10;
        }
        if(x<0)
        {
            return false;
        }
        else if(num==x)
        {
            System.err.println("true");
            return true;
        }
        else{
            System.err.println("false");
            return false;
        }

    }
}
class palindrom{
    public static void main(String[] args){
        Solution s=new Solution();
        s.isPalindrome(-131);
    }
}