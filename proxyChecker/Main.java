import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C://ip.txt"); // Создаём поток ввода
            int i;
            String resultIp = "";
            while ((i = fis.read()) != -1) { // Читаем из файла, в конце фала вернётся -1
                if (i == 13) continue; // Символ возврата каретки
                else if (i == 10) { // Символ переноса строки
                    String[] resultIpArray = resultIp.split(":"); // Разделяем ip и port по :
                    String ip = resultIpArray[0]; // Сохраняем ip
                    int port = Integer.parseInt(resultIpArray[1]); // Сохраняем порт, т.к. это строка, сначала преобразуем в число
                    checkProxy(ip, port); // Вызывем метод проверки ip адреса
                    resultIp = "";
                } else if (i == 9) { // Символ табуляции
                    resultIp += ":"; // Когда встретился символ табуляции, прибавляем к строке :
                } else {
                    resultIp += (char) i; // Сохраняем в строку любые другие смволы прочитанные из файла
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void checkProxy(String ip, int port) {
        System.out.println("Пробуем подключиться через прокси - " + ip + ":" + port);
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append(":").append(port);
            }
            writeText(response.toString());
            rd.close();
        } catch (IOException e) {
            System.out.println("Нерабочий ip");
        }
    }

    static void writeText(String text) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\good_ip.txt", true);
            int c;
            for (int i = 0; i < text.length(); i++) {
                c = (byte) text.charAt(i);
                fileOutputStream.write(c);
            }
            fileOutputStream.write(10);
            fileOutputStream.close();
            System.out.println(text + "Рабочий и добавлен в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
