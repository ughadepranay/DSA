package sorts;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {90, 8, 2, 12, 1100, 3, 1, 23, 28};
        bubbeSort(arr);
        for(int element : arr){
            System.out.print(element+ " ");
        }
    }

    public static void bubbeSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
