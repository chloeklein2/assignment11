import java.util.Arrays;

public class assignment11{
    public static <T extends Comparable<T>> void bubbleSort(T[] arr){
        int n =arr.length;
        for (int i=0; i < n-i-1; i++){
            for(int j = 0;j<n- i -1; j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static<T extends Combarable<T>>void mergeSort(T[] arr){
        if (arr.length<=1){
            return;
        }
        int mid = arr.length/ 2;
        T[] left =Arrays.copyOfRange(arr, 0, mid);
        T[] right = Arrays.copyOfRange(arr, mid,arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);

    }
    private static <T extends Combarable<T>> void merge(T[] arr, T[] left, T[]right){
        int i = 0, j= 0, k=0;
        while (i < left.length && j < right.length){
            if (left[i].compareTo(right[j])<=0){
                arr[k++] = left [i++];

            }else{
                arr[k++]=right[j++];
            }
        }
        while (i< left.length){
            arr[k++]=left[i++];
        }
        while (j< right.length){
            arr[k++]=right[j++];
        }
    }
}
