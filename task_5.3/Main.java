/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(1);
        list.add(12);

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (integer > 0 && integer < 10) {
                result.add(integer);
            }
        }
        System.out.println(result);

    }
}
