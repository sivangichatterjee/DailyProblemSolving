class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> op=new ArrayList<>();
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            // if(!mp.containsKey(nums[i]))
            // {
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            // }
        }
       for (Map.Entry<Integer, Integer> entry : mp.entrySet()) 
       {
            if(entry.getValue()>n/3)
            {
                op.add(entry.getKey());
            }
        }
        return op;
    }
}