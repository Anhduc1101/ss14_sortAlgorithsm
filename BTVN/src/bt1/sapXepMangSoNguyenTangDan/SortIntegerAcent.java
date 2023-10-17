package bt1.sapXepMangSoNguyenTangDan;

import java.util.Arrays;

public class SortIntegerAcent {
    static int[] arr;

    private static int[] getArr() {
        arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rikkei Academy*/
    }

    public static void bubbleSort(int[] arr) {
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int currentMin = arr[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin > arr[j]) {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > currentElement; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = currentElement;
        }
    }


    public static void main(String[] args) {
        arr = getArr();
        System.out.println("Trước khi sort: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sau khi bubbleSort: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sau khi selectionSort: " + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("Sau khi insertSort: " + Arrays.toString(arr));
    }
}
