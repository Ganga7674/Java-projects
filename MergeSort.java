public class MergeSort
{
    public static void mergeSort(int[] arr)
    {
        if(arr==null || arr.length<=1)
        {
            return;
        }
        int[] temp=new int[arr.length];
        mergeSortHelper(arr,0,arr.length-1,temp);
    }
    private static void mergeSortHelper(int[] arr,int left,int right,int[] temp)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    } 
    private static void merge(int[] arr,int left,int mid,int right,int[] temp)
    {
        for(int i=left;i<=right;i++)
        {
            temp[i]=arr[i];
        }
        int i=left;
        int j=mid+1;
        int k=left;
        while(i<=mid && j<=right)
        {
            if(temp[i]<=temp[j])
            {
                arr[k++]=temp[i++];
            }
            else
            {
                arr[k++]=temp[j++];
            }
        }
        while(i<=mid)
        {
            arr[k++]=temp[i++];
        }
    }
    public static void main(String[] args)
    {
        int[] arr={12, 11, 13, 5, 6, 7};
        mergeSort(arr);
        System.out.print("Sorted array:");
        for(int num : arr)
        {
            System.out.println(num + " ");
        }
    }
}