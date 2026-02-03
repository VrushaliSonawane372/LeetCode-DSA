class Solution {
    public int lengthOfLongestSubstring(String s)
     {
        if (s.length() == 0) return 0;
        Map<Character, Integer> HM = new HashMap<>();
         int left = 0;
         int MaxLength = 0;
         int currentLength = 0;

       

         for(int right = 0; right < s.length(); right++)
         {
            
            char currentchar = s.charAt(right);

            // If character already seen and inside current window
            if(HM.containsKey(currentchar) && HM.get(currentchar) >= left)
            {
                left = HM.get(currentchar) + 1;
            }

             // Update last seen index
            HM.put(currentchar,right);


            // Calculate current window length AFTER fixing left
            currentLength = right - left + 1;

            MaxLength = Math.max(currentLength, MaxLength);
         }
          return MaxLength;   
    }
}