

public class Main {
    public static void main(String[] args) {

        int arr[] = {7, 13, 19, 1, 4, 77, 63};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Массив отсортирован по возрастанию");
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}