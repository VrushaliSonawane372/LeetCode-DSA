class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> frequencymap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for(int i = 0; i < nums.length; i++)
        {
            int value = nums[i];
            frequencymap.put(value, frequencymap.getOrDefault(value,0)+ 1); 
        }
        for(int key : frequencymap.keySet())
        {
            int frequency = frequencymap.get(key);
            if(bucket[frequency] == null)
            {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int result[] = new int[k];
        int count = 0;
        for(int pos = bucket.length-1; pos >= 0 && count < k; pos--)
        {
            if(bucket[pos] != null)
            {
                for(Integer integer : bucket[pos])
                {
                    result[count++] = integer;
                }
            }
        }
        return result;    
    }
}