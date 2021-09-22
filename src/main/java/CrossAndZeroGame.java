import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CrossAndZeroGame {

    private static char[][] map;
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';
    private static final char EMPTY_DOT = '•';
    private static final int MAP_SIZE = 3;
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isWin(X_DOT)) {
                System.out.println("YOU WIN");
                break;
            }
            if (isDraw()) {
                break;
            }
            computerTurn();
            printMap();
            if (isWin(O_DOT)) {
                System.out.println("YOU LOSE");
                break;
            }
            if (isDraw()) {
                break;
            }
        }

    }

    private static boolean isWin(char dot) {

        int[] checkToWin = new int[MAP_SIZE*2+2];
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                if (i == j && map[i][j] == dot) {
                    checkToWin[MAP_SIZE*2]++;
                }
                if (i+j == MAP_SIZE-1 && map[i][j] == dot) {
                    checkToWin[MAP_SIZE*2+1]++;
                }
                if (map[i][j] == dot) {
                    checkToWin[i]++;
                }
                if (map[j][i] == dot) {
                    checkToWin[i+MAP_SIZE]++;
                }
            }
        }
        for (int i = 0; i < checkToWin.length; i++){
            if (checkToWin[i] == MAP_SIZE) return true;
        }
        return false;
    }

    private static void humanTurn() {
        int xCoordinate;
        int yCoordinate;
        System.out.println("Введите координаты в формате \"x пробел y\"");
        do {
            xCoordinate = -1;
            yCoordinate = -1;

            if (SC.hasNextInt()) {
                xCoordinate = SC.nextInt();
            }
            if (SC.hasNextInt()) {
                yCoordinate = SC.nextInt();
            }
            SC.nextLine();
        } while (!isValidHumanTurn(xCoordinate, yCoordinate));
    }

    private static void computerTurn() {
        int xCoordinate;
        int yCoordinate;
        Random random = new Random();
        do {
            xCoordinate = random.nextInt(MAP_SIZE);
            yCoordinate = random.nextInt(MAP_SIZE);
        } while (!isValidComputerTurn(xCoordinate, yCoordinate));
    }

    private static boolean isValidHumanTurn(int xCoordinate, int yCoordinate) {
        if (xCoordinate < 1 || yCoordinate < 1 ||
                xCoordinate > MAP_SIZE || yCoordinate > MAP_SIZE) {
            System.out.println("Вы ввели неправильные координаты. Введите координаты в формате \"x пробел y\"");
            return false;
        }

        if (map[xCoordinate - 1][yCoordinate - 1] == EMPTY_DOT) {
            map[xCoordinate - 1][yCoordinate - 1] = X_DOT;
            return true;
        }
        System.out.println("Вы ввели неправильные координаты. Введите координаты в формате \"x пробел y\"");
        return false;
    }

    private static boolean isValidComputerTurn(int xCoordinate, int yCoordinate) {
        if (map[xCoordinate][yCoordinate] == EMPTY_DOT) {
            map[xCoordinate][yCoordinate] = O_DOT;
            return true;
        }
        return false;
    }

    private static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initMap() {
        map = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            Arrays.fill(map[i], EMPTY_DOT);
        }
    }

    private static boolean isDraw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        System.out.println("DRAW");
        return true;
    }
}