class Solution {
    public int reverse(int x) 
    {
       int digit, Rev = 0;
       while(x != 0)
       {
         digit = x % 10;
          x = x / 10;

         if(Rev > 0 && Rev > (Integer.MAX_VALUE - digit) / 10 || Rev < 0 && Rev < (Integer.MIN_VALUE - digit) / 10) 
         return 0;
         Rev = Rev * 10 + digit;
       } 
       return Rev;   
    }
}