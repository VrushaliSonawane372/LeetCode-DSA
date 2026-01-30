class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int LongestLen = 0;
        Map<Integer, Boolean> hashmap = new HashMap<>();
        for(int n : nums)
        {
            hashmap.put(n, Boolean.FALSE);
        }    

        for(int n : nums)
        {
            int CurrentLength = 1;
            int nextNum = n + 1;
            while(hashmap.containsKey(nextNum) && hashmap.get(nextNum) == false)
            {
                CurrentLength++;
                hashmap.put(nextNum, true);
                nextNum++;
            }

            int prevNum = n - 1;
            while(hashmap.containsKey(prevNum) && !hashmap.get(prevNum))
            {
                CurrentLength++;
                hashmap.put(prevNum, true);
                prevNum--;
            }
            LongestLen = Math.max(LongestLen, CurrentLength);

        }
        return LongestLen;
    }
}