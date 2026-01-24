class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int Arr[] = new int[26];
        if(s.length()!= t.length())
        {
            return false;
        }
        for(int index = 0; index < s.length(); index++)
        {
            Arr[s.charAt(index) - 'a']++;
            Arr[t.charAt(index) - 'a']--;
        }
        for(int index = 0; index < Arr.length; index++)
        {
            if(Arr[index] != 0)
            {
                return false;
            }
        }
        return true;
    }
}