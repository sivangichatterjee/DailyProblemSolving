import java.util.*;
public class longestSubarrayNegatives {
    public static void main(String[] args) {
        //this solution will not work with negative values
        //if negative values are a part of the array then use Hashing technique
        //int arr[]={-13, 0, 6, 15, 16 ,2 ,15, -12, 17, -16, 0 ,-3, 19, -3, 2, -9, -6}; int k= 15;
        int arr[]={0,0,0};int k=0;
        int len=0,l=0, i=0, rem=0, sum=0,c=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                len=Math.max(len, i+1);
                c++;
                
            }
            rem=sum-k;
            if(mp.containsKey(rem))
            {
                l=i-mp.get(rem);
                len=Math.max(len, l);
            }
            else
            {
                
            }
            if(!mp.containsKey(sum))
            {
                mp.put(sum, i);
            }
        }
        System.out.println(len);
    }
}
