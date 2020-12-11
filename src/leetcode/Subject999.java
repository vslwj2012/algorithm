package leetcode;

import java.util.Arrays;

/**
 * 最小的k个数
 * 设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
 *
 * @author vega
 */
public class Subject999 {

    /**
     * 解法一 部分排序
     * 1.在前k个中找到最大的数
     * 2.在后n-k个数中依次遍历，当小于前k个中的最大的数时交换两个数位置
     * 3.重复步骤1，2
     * @param arr
     * @param k
     * @return
     */
    public static int[] smallestK(int[] arr, int k) {
        for (int i = k; i < arr.length; i++) {
            int kMaxIndex = getKArrMaxIndex(arr, k);
            if (arr[i] < arr[kMaxIndex]) {
                int t = arr[i];
                arr[i] = arr[kMaxIndex];
                arr[kMaxIndex] = t;
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static int getKArrMaxIndex(int[] arr, int k) {
        int maxIndex = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * 解法2 暴力排序
     * @param arr
     * @param k
     * @return
     */
    public static int[] smallestK1(int[] arr, int k) {
        quickSort(arr,0,arr.length-1);
        int[] result=new int[k];
        for (int n=0;n<k;n++){
            result[n]=arr[n];
        }
        return result;
    }

    public static void quickSort(int[] arr,int left,int right){
        if (left >= right) {
            return;
        }

        int q = arr[left];
        int i = left, j = right;

        while (i < j) {
            while (i < j && arr[j] >= q) {
                j--;
            }
            if (i < j) {
                arr[i++] = arr[j];
            }

            while (i < j && arr[i] < q) {
                i++;
            }
            if (i < j) {
                arr[j--] = arr[i];
            }
        }
        arr[i] = q;
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

    /**
     * 解法3 堆
     * @param arr
     * @param k
     * @return
     */
    public static int[] smallestK2(int[] arr, int k) {
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        int[] result = smallestK1(arr, 4);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
