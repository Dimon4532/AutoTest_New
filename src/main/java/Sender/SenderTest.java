package Sender;

import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;


public class SenderTest {
        // тест с падением на 1ой ошибке
        @Test
        void testSendWithConditions() {
            Sender sender = new Sender("example.com", "/api", "default body");
            String result = sender.send("https://github.com", "", "body");

            // Проверка с if-else
            if (!result.contains("https://github.com")) {
                fail("URL не совпадает");
            } else if (!result.contains("/Dimon4532/AutoTest_New")) {
                fail("Path не совпадает");
            } else if (!result.contains("body")) {
                fail("Body не совпадает");
            } else {
                System.out.println("Все части ответа корректны!");
            }
        }

    private void fail(String urlНеСовпадает) {
    }

    //тест когда собираем все ошибки( contains состоит из.. частичное совпадение)
        @Test
        void testSendWithAllErrorsReported() {
            Sender sender = new Sender("example.com", "/api", "default body");
            String result = sender.send("https://github.com", "/Dimon4532/AutoTest_New", "body");

            StringBuilder errors = new StringBuilder();

            // Проверяем все условия и собираем ошибки "https://github.com", "/Dimon4532/AutoTest_New", "body"));
            if (!result.contains("https://github.com")) {
                errors.append("URL не совпадает\n");
            }

            if (!result.contains("/ViktoriiaBelousova/TestAQA")) {
                errors.append("Path не совпадает\n");
            }

            if (!result.contains("body")) {
                errors.append("Body не совпадает\n");
            }

            // Если есть ошибки - выводим все разом
            if (errors.length() > 0) {
                fail("Найдены ошибки:\n" + errors.toString());
            } else {
                System.out.println("Все части ответа корректны!");
            }
        }

        //проверка абсолютного совпадения
        @Test
        void testSendWithExactMatch() {
            Sender sender = new Sender("default.com", "/api", "default body");

            // Ожидаемый результат
            String expected = "По данному пути: https://github.com/ViktoriiaBelousova/TestAQA , отправлен запрос с телом: body";

            // Фактический результат
            String actual = sender.send("https://github.com", "/ViktoriiaBelousova/TestAQA", "body");

            // Проверка абсолютного совпадения
            assertEquals(expected, actual);
        }


    }
}
