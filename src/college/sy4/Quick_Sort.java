package college.sy4;

class QuickSort {
    void sort(int[] arr, int p, int r) {
        if (p >= r) {
			return;
		}

        int q = arr[p];
        int i = p, j = r;

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

        sort(arr, p, i - 1);
        sort(arr, i + 1, r);

    }

}

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            arr[i] = (int) (0 + Math.random() * 99);
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        new QuickSort().sort(arr, 0, len - 1);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}