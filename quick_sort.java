public class quick_sort{
    public static void main(String[] args)
    {
        int arr[]={4,3,8,1};
        System.out.println("Before sort:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        quicksort(arr,0, 3);
        System.out.println("After sort:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int partition=sort(arr, low, high);
            quicksort(arr, low, partition-1);
            quicksort(arr, partition+1, high);
        }
    }
    // static void swap(int a, int b)
    // {
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }
    public static int sort(int arr[], int low, int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<=high-1 )
            {
                i++;
            }
            while(arr[j]>pivot && j>=low+1)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }    
}