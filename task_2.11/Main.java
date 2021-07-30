/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 5, 9, 12, 15};
        int summ = a[0];
        for (int i = 1; i < a.length; i++) {
            summ += a[i];
            if (summ > 10) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
