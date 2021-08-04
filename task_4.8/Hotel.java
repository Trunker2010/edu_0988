public class Hotel {
    Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms() {
        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree()) freeRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера свободных комнат " + freeRoomsList);
    }

    public void reserveRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && room.isFree()) {
                room.setFree(false);
                info = ("Комната номер " + roomNumber + " успешно забронированна");
                break;
            } else if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                info = "Комната " + roomNumber + " занята";
                break;
            }
        }
        System.out.println(info);
    }

    public void getInfo(byte roomNumber) {
        String info = "Такой комнаты не существует";
        Room room = null;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getRoomNumber() == roomNumber) {
                room = rooms[i];
                break;
            }
        }
        if (room != null) {
            info = "В комнате " + roomNumber + " WIFI:" + room.isWifi() + ", WC: " + room.isWc() + " EAT: " + room.isEat() + "спальных мест: " + room.getQuantity();
        }
        System.out.println(info);
    }

    public void getWIFIRooms() {
        StringBuilder WIFIRooms = new StringBuilder();
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isWifi()) {
                WIFIRooms.append(rooms[i].getRoomNumber()+" ");
            }
        }
        if (!WIFIRooms.isEmpty()) {
            System.out.println("Номера с WIFI: " + WIFIRooms);
        } else {
            System.out.println("Номера с WIFI отсутствуют");
        }
    }
    public void getWCRooms() {
        StringBuilder WCRooms = new StringBuilder();
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isWc()) {
                WCRooms.append(rooms[i].getRoomNumber()+" ");
            }
        }
        if (!WCRooms.isEmpty()) {
            System.out.println("Номера с WC: " + WCRooms);
        } else {
            System.out.println("Номера с WC отсутствуют");
        }
    }
    public void getQuantity(byte quantity) {
        StringBuilder quantityRooms = new StringBuilder();
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getQuantity() == quantity) {
                quantityRooms.append(rooms[i].getRoomNumber()+" ");
            }
        }
        if (!quantityRooms.isEmpty()) {
            System.out.println("Номера с "+quantity+ " спальными местами: " + quantityRooms);
        } else {
            System.out.println("Номера с "+quantity+ " спальными местами отсутствуют");
        }
    }

}
