package Sender;

public class Sender {
    private String url;
    private String path;
    private String body;


    // Конструктор (опционально, если нужно инициализировать объект с параметрами)
    public Sender(String url, String body, String path) {
        // Поля класса
    }

    // Метод send(), который принимает параметры и возвращает строку
    public String send(String url, String path, String body) {
        // Формируем строку из параметров (можно настроить формат по желанию)
        return String.format("Sent request to URL: %s, Path: %s, Body: %s", url, path, body);

        // Пример использования
        public static void main (String[] args){

            Sender sender = new Sender("example.com", "/api", "default body");

            // Используем параметры метода
            System.out.println(sender.send("https://github.com", "/Dimon4532/AutoTest_New", "body"));
            // Вывод: Отправлено на google.com/search с телом: query
        }

    }