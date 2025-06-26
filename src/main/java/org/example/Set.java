package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        // 1. Создаем множество уникальных целых чисел
        //HashSet не хранит повторяющиеся значения
        java.util.Set<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // 2. Добавляем 5 номеров (включая дубликаты)
        System.out.println("Добавляем числа в множество (включая дубликаты): 10, 20, 10, 30, 20");
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);  // Дубликат - не добавится
        numbers.add(30);
        numbers.add(20);  // Дубликат - не добавится

        // 3. Выводим все элементы множества
        System.out.println("\nСодержимое множества:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 4. Проверяем наличие конкретного номера
        System.out.print("\nВведите число для проверки: ");
        int numberToCheck = scanner.nextInt();
        if (numbers.contains(numberToCheck)) {
            System.out.println("Число " + numberToCheck + " присутствует в множестве");
        } else {
            System.out.println("Число " + numberToCheck + " отсутствует в множестве");
        }

        // 5. Удаляем число по запросу
        System.out.print("\nВведите число для удаления: ");
        int numberToRemove = scanner.nextInt();
        if (numbers.remove(numberToRemove)) {
            System.out.println("Число " + numberToRemove + " успешно удалено");
        } else {
            System.out.println("Число " + numberToRemove + " не найдено в множестве");
        }

        // 6. Подсчитываем количество элементов
        System.out.println("\nТекущее количество элементов в множестве: " + numbers.size());

        // Выводим итоговое множество
        System.out.println("\nИтоговое содержимое множества:");
        System.out.println(numbers);

        scanner.close();
    }
}
