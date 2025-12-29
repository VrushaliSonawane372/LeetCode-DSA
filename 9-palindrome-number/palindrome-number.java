class Solution {
    public boolean isPalindrome(int x)
    {

        if(x < 0)
        return false;
        int cpy = x;
        int Rev = 0;
        boolean bRet = false;
        int digit = 0;

        while(x > 0)
        {
           digit = x % 10;
           Rev = Rev * 10 + digit;
            x = x / 10;
        }
        if(cpy == Rev)
        {
           bRet = true;
          // return bRet;
        }
        return bRet;
        
    }
}