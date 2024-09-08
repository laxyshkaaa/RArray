import java.util.HashSet;
import java.util.Random;

public class Main {

    // Константа для числа 14
    public static final int DIVISOR = 14;
    // Размер последовательности
    public static final int HASH_SIZE = 1000;
    // Максимальное значение элементов в последовательности
    public static final int MAX_VALUE = 10000;

    public static void main(String[] args) {
        Random random = new Random();




        // HashSet для хранения уникальных элементов последовательности
        HashSet<Integer> Numbers = new HashSet<>();
        // Заполняем HashSet для быстрого поиска
        while (Numbers.size() < HASH_SIZE) {
            Numbers.add(random.nextInt(1,10001)); // Добавляем случайное число от 1 до 10000
        }

        // Максимальное число, котор кратно 14 и является произведением двух различных чисел
        int maxR = -1;

        // Проходим по всем элементам последовательности
        for (int num : Numbers) {
            // Проверяем только те числа, которые кратны 14
            if (num % DIVISOR == 0) {
                // Для каждого такого числа пытаемся найти два различных множителя
                for (int factor1 : Numbers) {
                    if (num % factor1 == 0) {  // Если num делится на factor1
                        int factor2 = num / factor1;  // Вычисляем второй множитель
                        if (factor1 != factor2 && Numbers.contains(factor2)) {  // Проверяем, что это разные числа и оба в последовательности
                            maxR = Math.max(maxR, num);  // Обновляем максимальное значение
                            break;  // НАЙДЯ ЧТО НАМ НАДО ВЫХОДИМ ИЗ ВНУТРЕННЕГО ЦИКЛА
                        }
                    }
                }
            }
        }

        // Выводим результат
        if (maxR != -1) {
            System.out.println("Максимальное число, кратное 14 и являющееся произведением двух различных элементов: " + maxR);
        } else {
            System.out.println("-1");
        }
    }
}
