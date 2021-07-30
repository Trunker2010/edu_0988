/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }

        int max = 1;
        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
