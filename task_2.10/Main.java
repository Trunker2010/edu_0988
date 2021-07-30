/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] a = {10, 10, 25, 22, 18, 57, 54};
        boolean result = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
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
