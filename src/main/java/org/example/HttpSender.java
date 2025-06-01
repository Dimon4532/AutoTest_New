package org.example;

//import org.example.interfaces.Sender;

public abstract class HttpSender {
    protected final String url;
    protected final String path;

    public HttpSender(String url, String path) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("URL не может быть пустым");
        }
        if (path == null) {
            throw new IllegalArgumentException("Path не может быть null");
        }

        this.url = url;
        this.path = path;
    }

    public String getUrl() {

        return url;
    }

    public String getPath() {

        return path;
    }

    public abstract String send(String url, String path, String body);


    // Оющий метод для всех наследников
    protected String formatUrl(String url, String path) {
        return url + path;
    }
}

