class Solution {
    public int[] twoSum(int[] Arr, int target) {
        int N_Arr[] = new int[2];

        HashMap<Integer, Integer> HM = new HashMap<>();
        int i,First, Second = 0;
        for(i = 0; i < Arr.length; i++)
        {
            First = Arr[i];
            Second = target - First;

            // check if complement exists in hashmap
            if(HM.containsKey(Second))
            {
              N_Arr[0] = HM.get(Second);
              N_Arr[1] = i;
              return N_Arr;

            }
             // store value → index
            HM.put(First,i);
        }
        //If no pair found return -1
        N_Arr[0] = -1;
        N_Arr[1] = -1;
        return N_Arr;
    }
}