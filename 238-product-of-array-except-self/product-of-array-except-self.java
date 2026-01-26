class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int Ans[] = new int[nums.length];
        Ans[0] = 1;
        int sufix = 1;
        for(int i = 1; i < nums.length; i++)
        {
            Ans[i] = Ans[i-1] * nums[i-1];
        } 
        for(int j = nums.length-2; j >= 0 ; j--)
        {
            sufix = sufix * nums[j+1];
            Ans[j] = Ans[j] * sufix;
        }
        return Ans;

    }
}