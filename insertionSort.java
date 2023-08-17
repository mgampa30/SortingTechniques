import java.util.*;
class InsertionSort {
    public static void main(String[] args) {
    int[] arr = {2,8,5,3,9,4};    
    insertionSort(arr); 
    System.out.print(Arrays.toString(arr));
        }
    public static int[] insertionSort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>current){
                    arr[j+1] = arr[j--];
                }
            arr[j+1] = current;
        }
     return arr;
}
}
