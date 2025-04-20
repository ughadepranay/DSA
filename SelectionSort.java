public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{0, -88, 9, 10, 120, 45, -1234};
        selectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){        //-1234 , -88, 9, 10, 120, 45, 0
            int smallestIdx = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    smallestIdx = j;
                }
            }
            int temp = arr[smallestIdx];
            arr[smallestIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
