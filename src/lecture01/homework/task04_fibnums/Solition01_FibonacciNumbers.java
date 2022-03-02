package lecture01.homework.task04_fibnums;

//Алгоритм поиска числа Фибоначчи. Рекурсивная реализация (самое медленное).
// n: 0, 1, 2, 3, 4, 5,...
//f: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

public class Solition01_FibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    //простой метод (очень медленно после 50-го числа)
    private static long fib(int n) {
        if (n <= 1) return n;

        return  fib(n - 1) + fib(n - 2);
    }
}
