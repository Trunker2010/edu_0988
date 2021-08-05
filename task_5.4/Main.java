/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();
        File file = new File(path);
        ArrayList<Integer> input = new ArrayList<>();

        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                if (number % 2 == 0) {
                    input.add(number);
                }
            }
            fileScanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (input.get(i)>input.get(j)){
                    int temp = input.get(i);
                    input.set(i,input.get(j));
                    input.set(j,temp);
                }
                break;
            }
        }
        System.out.println(input);
    }
}
