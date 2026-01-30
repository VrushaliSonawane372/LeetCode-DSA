class Solution 
{
    public boolean isPalindrome(String s)
    {
        String cpy = "";
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       for(int i = s.length()-1; i >= 0; i--)
       {
          cpy += s.charAt(i);
       } 
       if(cpy.equals(s))
       {
         return true;
       }
       return false;
    }
}