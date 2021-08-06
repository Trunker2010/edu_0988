/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


/*
Модернизация ПО
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> listMap = new HashMap<>();
        while (true) {
            System.out.println("Введите фамилию: ");
            String family = scanner.nextLine();
            System.out.println("Введите город: ");
            String city = scanner.nextLine();
            if (family.isEmpty() || city.isEmpty()) {
                break;
            }
            if (listMap.get(city) == null) {
                ArrayList<String> familyList = new ArrayList<>();
                familyList.add(family);
                listMap.put(city, familyList);
            } else {
                listMap.get(city).add(family);
            }
        }

        // Read the house number
        System.out.println("Введите город для поиска");
        String city = scanner.nextLine();

        if (!city.isEmpty()) {
            ArrayList<String> familyList = listMap.get(city);
            System.out.println("В городе " + city + " живут:");
            for (String f : familyList
            ) {
                System.out.println(f);
            }
        }
    }
}
