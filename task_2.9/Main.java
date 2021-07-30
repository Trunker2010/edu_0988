/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        boolean result = false;
        int[] a = {10, 20, 30, 40, 50, 60, 70};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 5) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
}
