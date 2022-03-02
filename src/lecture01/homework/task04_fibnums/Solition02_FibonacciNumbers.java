package lecture01.homework.task04_fibnums;

//Алгоритм поиска числа Фибоначчи. Цикл + Массив.
// n: 0, 1, 2, 3, 4, 5,...
//f: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

import java.math.BigInteger;

public class Solition02_FibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(fibMass(100));
    }

    //более быстрый метод расчёта числа Фибоначчи (с помощью массива):
    private static BigInteger fibMass(int n) {

        BigInteger[] array = new BigInteger[n + 1];

        array[0] = BigInteger.valueOf(0);
        array[1] = BigInteger.valueOf(1);

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1].add(array[i - 2]);
        }
        return array[n];
    }
}
