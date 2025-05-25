package org.example;

public class Sender {
    private final String url;
    private final String path;
    private final String body;

    public String getUrl() {
        return url;
    }

    public String getPath() {
        return path;
    }

    public String getBody() {
        return body;
    }

    // Конструктор с параметрами
    public Sender(String url, String path, String body) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("url is null or empty");
        }
        if (path == null || path.isEmpty()) {
            throw new IllegalArgumentException("path is null or empty");
        }

        this.url = url;
        this.path = path;
        this.body = body;
    }

    // Метод send с параметрами
    public String send(String url, String path, String body) {
        // Используем переданные параметры или значения по умолчанию из полей класса
        String actualUrl = (url != null && !url.isEmpty()) ? url : this.url;
        String actualPath = (path != null && !path.isEmpty()) ? path : this.path;
        String actualBody = (body != null && !body.isEmpty()) ? body : this.body;

        // Формируем результирующую строку
        return String.format("По данному пути: %s%s , отправлен запрос с телом: %s",
                actualUrl,
                actualPath,
                actualBody);
    }

    public String send(String url, String path) {
        return send(url,path,  "test body");
    }

    public String send() {
        return send( null,  null,  null);
    }


    // Пример использования
    public static void main(String[] args) {
        Sender sender = new Sender("example.com", "/api", "default body");

        // Используем параметры метода
        System.out.println(sender.send("https://github.com", "/Dimon4532/AutoTest_New", "body"));
        System.out.println(sender.send("https://github.com", "/Dimon4532/AutoTest_New"));
        System.out.println(sender.send());
        // Вывод: Отправлено на google.com/search с телом: query

    }
}
