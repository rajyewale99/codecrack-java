public class quicksort {
    public static void quick(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        //Last index
        int pidx = partition(arr,si,ei);
        quick(arr, si, pidx-1 );//Left
        quick(arr, pidx+1, ei);//Right
    }
    public static int partition(int arr[], int si, int ei){
        int pivot=arr[ei];
        int i=si-1; //to make place for smaller than pivot 
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //Pivot
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,7,3,2,8,6,0};
        quick(arr, 0, arr.length-1);
        printarr(arr);
    }
}
