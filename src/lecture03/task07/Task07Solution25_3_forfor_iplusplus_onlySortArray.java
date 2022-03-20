package lecture03.task07;

//Просто чтобы выделить саму соритровку массива.
// Решение через for-ы и увеличивающийся инкремент i++;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task07Solution25_3_forfor_iplusplus_onlySortArray {

    public static void main(String[] args) throws Exception {
        int maximum;
        int minimum;
        //напишите тут ваш код
        int[] array = {2, 20, 11, 8, 17, 10, 18, 5, 14, 19, 3, 15, 6, 9, 1, 12, 4, 16, 7, 13};
        //Самописная сортировка массива (BubbleSort)
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Перед Вами отсортированный массив чисел метод сортировки (BubbleSort): ");
        //Вывод в консоль отсортированного массива (BubbleSort) через for-ы и увеличивающийся инкремент i++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
