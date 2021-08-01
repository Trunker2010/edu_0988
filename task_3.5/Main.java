/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

public class Main {
    public static void main(String[] args) {
        int num[] = {4, 2, 6, 2, 65};
        printArr(num, 0);
    }

    static void printArr(int[] arr, int pos) {
        if (pos < arr.length) {
            System.out.println(arr[pos]);
            pos++;
            printArr(arr, pos);
        }
    }
}
