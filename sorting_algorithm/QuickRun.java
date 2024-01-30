public class QuickRun {

    public int[] bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped = false;

        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

    public int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min_idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }

    public int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = (start-1);
        for(int j=start; j<=end-1; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[end];
        arr[end] = arr[i+1];
        arr[i+1] = temp;
        return (i+1);
    }

    public int[] quickSort(int[] arr, int start, int end){
        if(start < end){
            int p = partition(arr,start,end);
            quickSort(arr,start,p-1);
            quickSort(arr,p+1,end);
        }
        return arr;
    }

    public void print(int[] arr1,int[] arr2,int[] arr3){
        System.out.println("Quick Sort");
        for(Integer e : arr1){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Bubble Sort");
        for(Integer e : arr2){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Selection Sort");
        for(Integer e : arr3){
            System.out.print(e+" ");
        }
    }

    public static void main(String args []){
        int[] arr = {123,45,64,23,12,432,34};
        int n = arr.length;
        QuickRun q = new QuickRun();

        int[] arr1 = q.quickSort(arr,0,n-1);
        int[] arr2 = q.bubbleSort(arr);
        int[] arr3 = q.selectionSort(arr);

        q.print(arr1,arr2,arr3);
    }
}
