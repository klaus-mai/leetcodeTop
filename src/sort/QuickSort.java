package sort;

/**
 * @author klaus
 * @date 2020/10/13 16:30
 */
public class QuickSort {

    public int getIndex(int[] arr){
        int low=0;
        int high=arr.length-1;
        int key=arr[low];
        while (low<high){
            while (low<high&&arr[low]<=arr[high]) high--;
            arr[low]=arr[high];
            while (low<high&&arr[low]>=arr[high]) low++;
            arr[high]=arr[low];
        }
        arr[low]=key;
        return low;
    }
}
