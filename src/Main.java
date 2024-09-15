import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Размер массива
        final int ARRAY_SIZE = 1000;
        final int MAX_VALUE = 10000;

        // Массив чисел
        int[] randomValues = new int[ARRAY_SIZE];

        // Генератор случайных чисел
        Random randomGen = new Random();

        // Заполнение массива случайными числами
        for (int i = 0; i < ARRAY_SIZE; i++) {
            randomValues[i] = randomGen.nextInt(MAX_VALUE) + 1; // случайные числа от 1 до 10000
        }

        // Максимальное число, кратное 2, но не кратное 14
        int maxDivBy2 = 0;
        // Максимальное число, кратное 7, но не кратное 14
        int maxDivBy7 = 0;
        // Максимальное число, кратное 14
        int maxDivBy14 = 0;
        // Максимальное число, не кратное 2, 7 и 14
        int maxNotDivBy2or7 = 0;

        // Поиск максимальных чисел
        for (int value : randomValues) {
            if (value % 14 == 0 && value > maxDivBy14) {
                maxDivBy14 = value;
            } else if (value % 2 == 0 && value > maxDivBy2) {
                maxDivBy2 = value;
            } else if (value % 7 == 0 && value > maxDivBy7) {
                maxDivBy7 = value;
            } else if (value > maxNotDivBy2or7) {
                maxNotDivBy2or7 = value;
            }
        }

        // Поиск подходящего числа
        int result = 0;

        // Проверка для числа, кратного 14
        if (maxDivBy14 > 0) {
            result = maxDivBy14;
        }
        // Проверка для числа, кратного 2, но не кратного 14
        else if (maxDivBy2 > 0) {
            result = maxDivBy2;
        }
        // Проверка для числа, кратного 7, но не кратного 14
        else if (maxDivBy7 > 0) {
            result = maxDivBy7;
        }
        // Проверка для числа, не кратного 2, 7 и 14
        else if (maxNotDivBy2or7 > 0) {
            result = maxNotDivBy2or7;
        }

        // Вывод подходящего числа
        if (result != 0) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
