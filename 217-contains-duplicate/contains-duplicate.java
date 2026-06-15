class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> HM = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(HM.containsKey(nums[i]))
            {
                return true;
            }
            HM.put(nums[i],i);
        }    
        return false;
    }
}