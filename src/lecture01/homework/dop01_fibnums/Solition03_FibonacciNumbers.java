package lecture01.homework.dop01_fibnums;

//Алгоритм поиска числа Фибоначчи. Цикл + Массив.
// n: 0, 1, 2, 3, 4, 5,...
//f: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

import java.math.BigInteger;
import java.util.Arrays;

public class Solition03_FibonacciNumbers {

    public static void main(String[] args) {
        int n = 100;
        BigInteger[] memory = new BigInteger[n + 1];
        Arrays.fill(memory, BigInteger.valueOf(-1));
        System.out.println(fib(n, memory));
    }
    //модернизированный простой метод стал гораздо быстрее:
    private static BigInteger fib(int n, BigInteger[] memory) {
        if (memory[n] != BigInteger.valueOf(-1))
            return memory[n];
        if (n <= 1)
            return BigInteger.valueOf(n);

        BigInteger result =  fib(n - 1, memory).add(fib(n - 2, memory));
        memory[n] = result;

        return  result;
    }
}
