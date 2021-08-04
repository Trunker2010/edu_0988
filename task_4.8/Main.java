import java.util.Scanner;

/*
 *  ***Гостиница***
 *  1) Гостиница
 *  2) Номера (кол-во мест(1-3), сан.узел(есть/нет), питаение(есть/нет), wifi(есть/нет), свободен/занят)
 *
 *   *Задание для лабораторной работы №4*
 *   Освободить комнату
 *   Вывести свойства комнаты
 *   Показать комнаты с WiFi
 *   Показать комнаты с WC
 *   Показать комнаты с Eat
 *   Показать комнаты по кол-ву спальных мест
 *   Отобразить список команд
 * */
public class Main {

    public static final String GET_FREE_ROOMS = "getFreeRooms";
    public static final String EXIT = "exit";
    public static final String GET_INFO = "getInfo";
    public static final String GET_WIFI_ROOMS = "getWIFIRooms";
    public static final String GET_WC_ROOMS = "getWCRooms";
    public static final String GET_QUANTITY = "getQuantity";

    public static void main(String[] args) {
        System.out.println("СПИСОК КОМАНД: ");
        System.out.println(GET_FREE_ROOMS);
        System.out.println(GET_INFO);
        System.out.println(GET_WIFI_ROOMS);
        System.out.println(GET_WC_ROOMS);
        System.out.println(GET_QUANTITY);
        System.out.println(EXIT);

        Room[] rooms = {
                new Room((byte) 1, false, false, true, (byte) 11),
                new Room((byte) 2, true, true, false, (byte) 12),
                new Room((byte) 1, false, true, true, (byte) 13),
                new Room((byte) 3, true, false, false, (byte) 21),
                new Room((byte) 2, false, false, false, (byte) 22),
                new Room((byte) 1, true, true, true, (byte) 23),
                new Room((byte) 3, false, true, false, (byte) 31),
                new Room((byte) 3, true, true, false, (byte) 32),
                new Room((byte) 1, false, false, true, (byte) 33),
        };

        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true) {
            System.out.println("Введите команду");
            command = scanner.nextLine();
            if (command.equals(GET_FREE_ROOMS)) {
                hotel.getFreeRooms();
            } else if (command.equals("reserveRoom")) {
                System.out.print("Введите номер комнаты для бронирования: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.reserveRoom(roomNumber);
            } else if (command.equals(EXIT)) {
                break;
            } else if (command.equals(GET_INFO)) {
                System.out.print("Введите номер комнаты для получения информации: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.getInfo(roomNumber);
            } else if (command.equals(GET_WIFI_ROOMS)) {
                hotel.getWIFIRooms();
            } else if (command.equals(GET_WC_ROOMS)) {
                hotel.getWCRooms();
            } else if (command.equals(GET_QUANTITY)) {
                System.out.println("Введитe желаемое количество спальных мест");
                hotel.getQuantity((byte) scanner.nextInt());
            }
        }
    }
}
