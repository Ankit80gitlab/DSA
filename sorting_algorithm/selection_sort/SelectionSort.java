package selection_sort;

public class SelectionSort {


    public int[] sort(int[] arr){
        int n = arr.length;
        for(int i=0; i< n-1; i++){
            int min_idx = i;
            for(int j = i+1; j< n; j++){

                if(arr[j]<arr[min_idx]){
                    min_idx = j;}
            }

                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;

        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort obj = new SelectionSort();
        int[] arr2 = obj.sort(arr);
        for (Integer e : arr2) {
            System.out.print(e + " ");
        }
    }
}
