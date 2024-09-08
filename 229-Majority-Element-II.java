class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
         ArrayList<Integer> op=new ArrayList<>();
        // HashMap<Integer, Integer> mp=new HashMap<>();
        // int min=(int)n/3+1;
        // for(int i=0;i<nums.length;i++)
        // {
           
        //         mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        //         if(mp.get(nums[i])>=min && !op.contains(nums[i]))
        //         op.add(nums[i]);
        // }
        // return op;

        ////////Optimal approach
        int c1=0,e1=Integer.MIN_VALUE,c2=0,e2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(c1==0 && nums[i]!=e2)
            {
                e1=nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i]!=e1)
            {
                e2=nums[i];
                c2=1;
            }
            else if(nums[i]==e1){
                c1++;
            }
            else if(nums[i]==e2){
                c2++;
            }
            else
            {
                c1--;c2--;
            }
        }
        int c3=0, c4=0; int min=(int)n/3+1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==e1)
            c3++;
            if(nums[i]==e2)
            c4++;
        }
        if(c3>=min)
        op.add(e1);
        if(c4>=min)
        op.add(e2);
        return op;
    }
}