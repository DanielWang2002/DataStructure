import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // 選擇基準點 (pivot)
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // 將小於基準點的數放在左邊，大於基準點的數放在右邊
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // 遞迴左半部分
        if (low < j)
            quickSort(arr, low, j);

        // 遞迴右半部分
        if (high > i)
            quickSort(arr, i, high);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
