package bubble_sort;

public class BubbleSort {

    public int[] Sort(int [] arr){

        int n = arr.length;
        boolean swapped=false;

        for(int i=0; i<n-1; i++){
            swapped=false;
            for (int j=0; j<n-i-1; j++){
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

    public static void main (String [] args){
        int [] arr = {234,657,132,435,68,23};
        BubbleSort obj = new BubbleSort();
        int [] arr2 = obj.Sort(arr);

        for(Integer e : arr2){
            System.out.print(e+" ");
        }
    }
}
