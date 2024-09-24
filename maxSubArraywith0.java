import java.util.HashMap;

public class maxSubArraywith0{
    public static void main(String[] args) {
        int arr[]={5,-5,3,4,-4,-1,1,-1,1}; int n=9;
        HashMap<Integer, Integer> mp=new HashMap<>();
        int sum=0, i=0, j=0, c=0, max=Integer.MIN_VALUE;
        while(i<n)
        {
            sum=sum+arr[i];
            if(sum==0)
            {
               c=i+1;
            }
            else if(!mp.containsKey(sum))
            {
                mp.put(sum, i);
            }
            else if(mp.containsKey(sum))
            {
                c=i-mp.get(sum);
            }
            max=Math.max(max, c);
            i++;
        }      
        System.out.println(max);
    }
}