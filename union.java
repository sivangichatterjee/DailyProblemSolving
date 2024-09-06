import java.util.ArrayList;

public class union {
    public static void main(String[] args) {
        int n=4, m=8;
        int arr1[]={1,2,3,3};
        int arr2[]={2,3,3,4,5,7,7,10};
        ArrayList<Integer> union=new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j])
            {
                if(union.size()==0 || union.get(union.size()-1) != arr1[i])
                {
                    union.add(arr1[i]);                    
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1) != arr2[j])
                {
                    union.add(arr2[j]);                    
                }
                j++; 
            }
        }
        while(i<n)
        {           
                if(union.get(union.size()-1) != arr1[i])
                {
                    union.add(arr1[i]);                    
                }
                i++;           
        }
        while (j<m) {
                if(union.get(union.size()-1) != arr2[j])
                {
                    union.add(arr2[j]);                    
                }
                j++;
        }
        for( Integer item:union)
        {
            System.out.print(item +" ");
        }
    }
}
