class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int j = 0;
        for(int current = 1; current < nums.length; current++)
        {
            if(nums[current] != nums[j])
            {
                j++;
                nums[j] = nums[current];
            }
        }    
        return j+1;
    }
}