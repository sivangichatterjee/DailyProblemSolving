import java.util.HashSet;

public class longestConsecutiveSeq {
    public static void main(String[] args) {
        int nums[]={100,4,200,1,3,2};
         int l=nums.length;
        int i=0,c=1, longest=0;
      HashSet<Integer> st=new HashSet<>();
      for(i=0;i<l;i++)
      {
        st.add(nums[i]);
      }
      for(Integer item:st)
      {
        if(!st.contains(item-1))
        {
            c=1;
            int x=item;
            while(st.contains(x+1))
            {
                c++;
                x=x+1;
            }
            longest=Math.max(longest,c);
        }
      }
      System.out.println(longest);
    }
}
