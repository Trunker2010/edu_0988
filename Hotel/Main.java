import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(new Room[]{
                new Room(true, 2, true, true, 11),
                new Room(true, 3, true, true, 12),
                new Room(true, 2, false, false, 13),
                new Room(false, 1, false, false, 14),
                new Room(true, 4, true, true, 21),
                new Room(true, 3, false, false, 22),
                new Room(false, 3, false, false, 23),
                new Room(true, 4, true, false, 24),
                new Room(true, 4, true, true, 31),
                new Room(true, 1, false, false, 32),
                new Room(false, 1, false, false, 33),
                new Room(true, 4, true, false, 34),

        });
        String commands = "*----*\n" +
                "getFreeRooms (wc:[true|false]) (sleepingPlace:[кол-во мес]) (conditioner:[true|false]) (wifi:[true|false]))- показать все свободные комнтаы\n" +
                "reserve [номер комнаты] забронировать номер\n" +
                "getReservedRooms - показать зарезервированные номера\n" +
                "*----*";
        System.out.println(commands);
        System.out.println("Введите команду:");
        String command = scanner.nextLine();
        while (!command.equals("exit")) {
            if (command.indexOf("getFreeRooms") == 0) { // Допустим мы ввели getFreeRooms wc:true wifi:true (ниже комментарии для этой команды)
                String[] splitted = command.split(" "); // {"getFreeRooms","wc:true","wifi:true"}
                if (splitted.length == 1)
                    hotel.getFreeRooms(); // Длина массива splitted==1 только тогда, когда мы ввели getFreeRooms и больше ничего
                else {
                    boolean wc = false;
                    int sleepingPlace = 0;
                    boolean conditioner = false;
                    boolean wifi = false;
                    for (int i = 1; i < splitted.length; i++) { // Перебираем заказанные сервисы, для нашего примера {"wc:true","wifi:true"}
                        String[] service = splitted[i].split(" "); // "wc:true" = {"wc","true"}; "wifi:true" = {"wifi", "true"}
                        if (service[0].equals("wc")) wc = true; // wc = true
                        else if (service[0].contains("sleepingPlace")) {
                            String[] sleepingSplit = service[0].split(":");
                            sleepingPlace = Integer.parseInt(sleepingSplit[1]);// sleepingPlace=0
                        } else if (service[0].equals("conditioner")) {
                            conditioner = true; // conditioner = 0
                        } else if (service[0].equals("wifi")) {
                            wifi = true;// (на первой иттерации wifi=false) на второй иттерации ей присвоится значение wifi=true
                        }
                    }
                    // вызываем метод с параметрами getFreeRooms(true, 0, false, true, 2)
                    hotel.getFreeRooms(wc, sleepingPlace, conditioner, wifi, splitted.length - 1);
                }
            } else if (command.indexOf("reserve") == 0) {
                String[] spltted = command.split(" "); // {"reserve", "12"}
                int roomNumber = Integer.parseInt(spltted[1]);
                hotel.reserve(roomNumber);
            } else if (command.equals("getReservedRooms")) {
                hotel.getReservedRooms();
            } else {
                System.out.println("Ошибка: неизавестаная команда.\nСписок доступных команд:\n" + commands);
            }
            command = scanner.nextLine();
        }
    }
}
