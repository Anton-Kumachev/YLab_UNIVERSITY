package lecture02.homework.dop02_X_O;

//Не простая реализация простой игры "КРЕСТИКИ-НОЛИКИ"

import java.io.*;

public class Main_X_O {

    static final char SIGN_PLAYER01 = 'X'; //Игрок 1 ходит крестиками (X)
    static final char SIGN_PLAYER02 = 'O'; //Игрок 2 ходит ноликами (O)
    static final char SIGN_EMPTY = '-'; //Начальная пустая ячейка игрового поля
    static String namePlayer1;
    static String namePlayer2;
    static int countPlayer01Win = 0;
    static int countPlayer02Win = 0;
    static int countNoWinner = 0;
    static String fileRecord = "rating_records.txt";
    static boolean turn = true;
    static int countPlaceField = 0;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    char[][] playField; //Задаем двумерный массив 3х3 для игрового поля.

    Main_X_O() { //Конструктор для создания нового объекта
        playField = new char[3][3];
        System.out.println("Перед Вами пустое игровое поле:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                playField[i][j] = SIGN_EMPTY;
                System.out.print(playField[i][j]);
            }
            System.out.println("|");
        }
    }
    public static void main(String[] args) throws IOException {
        startGame(); //Выводим начальное поле для игры
        new Main_X_O().game();
    }

    void game() throws IOException {

        while (true) {
            movePlayer(); //Ход игрока 1(X)
            if (checkWinner(SIGN_PLAYER01)) {
                System.out.println(namePlayer1 + " ВЫИГРАЛ!!! КРЕСТИКИ РУЛЯТ!");
                countPlayer01Win++;
                break;
            }
            if (checkWinner(SIGN_PLAYER02)) {
                System.out.println(namePlayer2 + " ВЫИГРАЛ!!! НОЛИКАМ СНОВА КАТИТ!");
                countPlayer02Win++;
                break;
            }
            if (countPlaceField >= 9) {
                System.out.println("ВСЕ ЯЧЕЙКИ ЗАПОЛНЕНЫ. В ЭТОТ РАЗ У ВАС НИЧЬЯ!");
                countNoWinner++;
                break;
            }
            printPlayField(); //Вывод игрового поля после хода Игрока
        }
        System.out.println("КОНЕЦ ИГРЫ!");
        printPlayField();
        recordPlayerRating();//Записываем рейтинг игроков в файл

        System.out.println();
        System.out.println("СЫГРАЕМ ЕЩЁ РАЗ??? (Ответьте: \"Да\" или \"Нет\")");

        if (repeatGame()) {
            countPlaceField = 0;
            new Main_X_O().game();
        } else {
            result();
        }
    }

    static void result() { //Метод вывода рейтинга в консоль по окончанию игр
        try (BufferedReader reader = new BufferedReader(new FileReader(fileRecord))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    boolean repeatGame() throws IOException { //Повтор игры
        String answer = reader.readLine();
        if (answer.toLowerCase().equals("да")) {
            return true;
        } else
            return false;
    }

    static void startGame() throws IOException {
        System.out.println("ДОБРЫЙ ДЕНЬ!");
        System.out.println("ДАВАЙТЕ НАЧНЁМ ИГРУ: КРЕСТИКИ-НОЛИКИ!");
        inputNamePlayers();
    }

    static void inputNamePlayers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя игрока 1(X):");
        namePlayer1 = reader.readLine();

        System.out.println("Введите имя игрока 2(O):");
        namePlayer2 = reader.readLine();
    }
    void movePlayer() throws IOException {
        System.out.println();
        int x, y;
        do {
            if(turn) {
                System.out.println("Игрок 1(X), чтобы начать ход, введите номер строки(по горизонтали) от 1 до 3:");
            } else {
                System.out.println("Игрок 2(O), чтобы начать ход, введите номер строки(по горизонтали) от 1 до 3:");
            }
            x = Integer.parseInt(reader.readLine()) - 1;

            if(turn) {
                System.out.println("Игрок 1(X), чтобы завершить ход, введите номер столбца(по вертикали) от 1 до 3:");
            } else {
                System.out.println("Игрок 2(O), чтобы завершить ход, введите номер столбца(по вертикали) от 1 до 3:");
            }
            y = Integer.parseInt(reader.readLine()) - 1;
        } while (!checking(x, y));
        if (turn) {
            playField[x][y] = SIGN_PLAYER01;
            turn = !turn;
        } else {
            playField[x][y] = SIGN_PLAYER02;
            turn = !turn;
        }
        countPlaceField++;
    }

    boolean checking(int x, int y) { //Проверка введённых чисел при совершении хода
        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            System.out.println();
            System.out.println("Вы вышли за пределы допустимых значений, сосредоточтесь и повторите попытку.");
            System.out.println();
            return false;
        } else if (playField[x][y] == SIGN_PLAYER02) {
            System.out.println("Эта ячейка уже занята ноликами. Повторите попытку заново!");
            return false;
        } else if (playField[x][y] == SIGN_PLAYER01) {
            System.out.println("Эта ячейка уже занята крестиками. Повторите попытку заново!");
            return false;
        }
        return playField[x][y] == SIGN_EMPTY;
    }

    void printPlayField() { //Вывод поля после каждого хода игрока
        System.out.println("Игровое поле, после хода игрока:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                System.out.print(playField[i][j]);
            }
            System.out.println("|");
        }
    }

    boolean checkWinner(char sign) { //Метод проверки на победителя
        for (int i = 0; i < 3; i++) {
            if((playField[i][0] == sign && playField[i][1] == sign && playField[i][2] == sign) ||
                    (playField[0][i] == sign && playField[1][i] == sign && playField[2][i] == sign))
                return true;
            if ((playField[0][0] == sign && playField[1][1] == sign && playField[2][2] == sign) ||
                    (playField[2][0] == sign && playField[1][1] == sign && playField[0][2] == sign))
                return true;
        }
        return false;
    }

    void recordPlayerRating() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileRecord))) {
            writer.write("\n");
            writer.write("РЕЙТИНГ ИГРОКОВ: \n");
            writer.write("Игрок 1: " + namePlayer1 + " | " + "Победы: " + countPlayer01Win + "\n");
            writer.write("Игрок 2: " + namePlayer2 + " | " + "Победы: " + countPlayer02Win + "\n");
            writer.write("Ничьи: " + countNoWinner + "\n");
        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
}
