public class QuickRun {

    public int[] selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min_idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

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



    public static void main(String args []){

        QuickRun q = new QuickRun();
        int[] arr = {345,458,122,89,45,23,678,54};
        int[] arr2 = q.selectionSort(arr);
        int[] arr3 = q.bubbleSort(arr);

        for(Integer f : arr2){
            System.out.print(f+" ");
        }
        System.out.println();

        for(Integer f : arr3){
            System.out.print(f+" ");
        }
    }
}
