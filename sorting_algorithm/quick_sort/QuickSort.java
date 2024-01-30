package quick_sort;

public class QuickSort {

    public int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = (start - 1);

        for(int j=start; j<=end-1; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return (i+1);
    }

    public void quickSort(int[] arr, int start, int end){
        if(start < end){
            int p = partition(arr,start,end);
            quickSort(arr,start,p-1);
            quickSort(arr,p+1,end);
        }
    }

    public static void main(String[] args){
        int[] arr = {234,546,123,45,78,234,1,23};
        int n = arr.length;
        QuickSort q = new QuickSort();
        q.quickSort(arr,0,n-1);
        for(Integer e : arr){
            System.out.print(e+" ");
        }
    }
}
