package linear_search;

import java.util.Scanner;

public class LinearSearch {

    public void linearSearch(int[] arr, int key){
        int n = arr.length;
        int index = 0;
        boolean found = false;
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                found = true;
                index = i;
            }
        }if(found){
            System.out.print("Key at index : "+index);
        }else{
            System.out.println("Key not found");
        }
    }

    public static void main(String args[]){
        int [] arr = {10, 50, 30, 70, 80, 20, 90, 40};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        LinearSearch obj = new LinearSearch();
        obj.linearSearch(arr,key);
    }
}
