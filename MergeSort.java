import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{90, 50, 120, -2, 45, 21, 12, 150};
        mergeSort(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, right, mid);
        }
    }

    public static void merge(int[] arr, int left, int right, int mid){
        int[] leftA = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightA = Arrays.copyOfRange(arr, mid+1, right+1);

        int i = 0; int j= 0; int k = left;

        while(i < leftA.length && j < rightA.length){
            if(leftA[i] < rightA[j]){
                arr[k++] = leftA[i++];
            }else{
                arr[k++] = rightA[j++];
            }
        }

        while(i < leftA.length){
            arr[k++] = leftA[i++];
        }
        while(j < rightA.length){
            arr[k++] = rightA[j++];
        }
    }


}
