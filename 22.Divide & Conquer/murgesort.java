public class murgesort{
    public static void mergesor(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergesor(arr,si,mid); //left part
        mergesor(arr,mid+1,ei); //Right Part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i=si;// iterator for left part
        int j=mid+1;//ierator for right part
        int k=0;//iterator for temp arr
    


        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                 temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //Left Part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //Right Part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //Copy Temp to original Array
        for(k=0, i=si ; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,7,9,2,3,5,8,0};
        mergesor(arr, 0, arr.length-1);
        printarr(arr);
    }
}