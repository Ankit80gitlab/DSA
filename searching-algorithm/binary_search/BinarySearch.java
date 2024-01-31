package binary_search;

public class BinarySearch {

    public int binarySearch(int[] arr, int key){
        int l=0;
        int r= arr.length-1;
        while(l<=r){
            int m = l=(r-l)/2;
            if(arr[m]==key){
                return m;
            }
            if(arr[m]>key){
                r=m-1;
            }
            if(arr[m]<key){
                l = m+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89, 93, 97};
        BinarySearch b = new BinarySearch();
        int result = b.binarySearch(arr,637);
        if(result == -1){
            System.out.println("Not found");
        }else System.out.println("Found key at index "+result);
    }
}
