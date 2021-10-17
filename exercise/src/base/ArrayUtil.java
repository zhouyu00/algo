package base;


import java.util.List;

public class ArrayUtil {

    public static void printArray(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printArray(ListNode l) {
        while (l != null) {
            System.out.print(l.val + ",");
            l = l.next;
        }
        System.out.println();
    }

    public static void printList(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + ",");
        }
        System.out.println();
    }
}
