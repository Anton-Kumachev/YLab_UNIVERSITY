package lecture01.homework.task03;

/* Спонсор - это звучит гордо

Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.

Пример:
Коля проспонсировал Лену, и она стала известной певицей.
 */

import java.io.*;

public class Solution13task03 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        System.out.println(name1 + " проспонсировал " + name2 + ", и она стала известной певицей.");
    }
}