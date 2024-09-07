import java.util.HashMap;

public class countSubarraywithK {
    public static void main(String[] args) {
         int arr[]={0,0,0,0,0,0};int k=0;
        int len=0,l=0, i=0, rem=0, sum=0,c=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(i=0;i<arr.length;i++)
        {
            sum+=arr[i];
           rem=sum-k;
           c+=mp.getOrDefault(rem,0 );
           mp.put(sum,mp.getOrDefault(sum, 0)+1);
            
        }
        System.out.println(c);
    }
}
