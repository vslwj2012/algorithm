package college.sy3;

class Insert {
    void sort(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            int k = i;
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] > A[k]) {
                    int temp = A[j];
                    A[j] = A[k];
                    A[k] = temp;
                    k--;
                }
            }
        }
    }

    void sort1(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            int key = A[i], j = i - 1;
            while (j >= 0 && A[j] > key)  //��key��ֵ����ǰ��������������У���key>=A[j]������ѭ��,��key<A[j]��j--�����ж���һ�����Ƿ����key
            {                       //����������������С���������ֱ��key>=A[j]
                A[j + 1] = A[j];//�����������
                j--;
            }
            A[j + 1] = key;//��A[j]<A[i]��A[i]��ֵ����
        }
    }
}

public class Insert_Sort {
    public static void main(String[] args) {
        int A[] = new int[10];
        int n = A.length;

        for (int i = 0; i < n; i++) {
            A[i] = (int) (0 + Math.random() * 99);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        new Insert().sort1(A, n);

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
