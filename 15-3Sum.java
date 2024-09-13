class Solution {
    public List<List<Integer>> threeSum(int[] nums) {       
          int i = 0, j =1, k = nums.length - 1, sum = 0;   
        Arrays.sort(nums);
        List<List<Integer>> ll = new ArrayList<>(); 
        for(i=0;i<nums.length;i++)
        {
            j=i+1;
            k=nums.length-1;
            if(i>0 && nums[i-1]==nums[i])continue;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum<0) j++;
                else if(sum>0) k--;
                else
                {
                    List<Integer> ans=new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    ll.add(ans);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }           
            }
        }     
        return ll;
    }
}