package sorts;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 3,2 , 23, 234, 29, 50, -33, -222};
        insertionSort(arr);
        for(int element : arr){
            System.out.print(element + " ");
        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]  = temp;
                }
            }
        }
    }
}
