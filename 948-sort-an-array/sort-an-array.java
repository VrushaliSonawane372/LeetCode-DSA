class Solution 
{
    public int[] sortArray(int[] nums) 
    {
        MergeSort(nums, 0, nums.length-1); 
        return nums;     
    }

    public static  void MergeSort(int nums[],int start,int end)
    {
        if(start >= end) return;
       int mid = start + (end - start) / 2;  
       MergeSort(nums,start,mid);
       MergeSort(nums,mid+1,end);
       Merge(nums,start,mid, end);
    }
    public static void Merge(int nums[],int start, int mid,int end)
    {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= end)
        {
            if(nums[i] < nums[j])
            {
                temp[k] = nums[i];
                i++;
                 k++;
            }
            else
            {
                temp[k] = nums[j];
                j++;
                 k++;
            }
           
        }
        while(i <= mid)
        {
            temp[k] = nums[i];
            i++;
            k++;
        }
        while(j <= end)
        {
            temp[k] = nums[j];
            j++;
            k++;
        }
        for(int index = 0; index < temp.length; index++)
        {
            nums[start + index] = temp[index];
        }
        
        
    }
    
}