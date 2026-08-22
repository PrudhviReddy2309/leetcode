class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int sum=0;
        while(x>0)
        {
            int r=x%10;
            sum =sum*10+r;
            x=x/10;
        }
        if(sum==t)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}