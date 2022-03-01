package lecture01.homework.task04_fibnums;

//Алгоритм поиска числа Фибоначчи. Цикл + Массив.
// n: 0, 1, 2, 3, 4, 5,...
//f: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

public class Solition02_FibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(fibMass(92));
    }

    //более быстрый метод расчёта числа Фибоначчи (с помощью массива):
    //код считается правильно, пока не кончится long, примерно до 92-го числа
    private static long fibMass(int n) {
        long[] array = new long[n + 1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
