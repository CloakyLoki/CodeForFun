package yandex.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * На шахматной доске N x N находятся M ладей. Сколько пар ладей бьют друг друга?
 * Ладьи задаются парой i, j, обозначающих координаты клетки.
 * 1<=N<=10^9, 0<=M<=2 * 10^5,
 */
// Сложность O(M) - от количества ладей
public class ChessRooks {

    public static void main(String[] args) {
        int[][] rooks = {{1, 1}, {3, 1}, {1, 3}};
        System.out.println(countBeatingRooks(rooks));
    }

    public static int countBeatingRooks(int[][] rooks) {
        Map<Integer, Integer> rooksInRow = new HashMap<>();
        Map<Integer, Integer> rooksInCol = new HashMap<>();

        //Записываем все ладьи по строкам
        for (int[] rook : rooks) {
            int key = rook[0];
            if (!rooksInRow.containsKey(key)) {
                rooksInRow.put(key, 0);
            }
            rooksInRow.put(key, rooksInRow.get(key) + 1);
        }
        //Записываем все ладьи по столбцам
        for (int[] rook : rooks) {
            int key = rook[1];
            if (!rooksInCol.containsKey(key)) {
                rooksInCol.put(key, 0);
            }
            rooksInCol.put(key, rooksInCol.get(key) + 1);
        }
        return countPairs(rooksInRow) + countPairs(rooksInCol);
    }

    public static int countPairs(Map<Integer, Integer> rookMap) {
        int pairs = 0;
        for (Integer key : rookMap.keySet()) {
            pairs += rookMap.get(key) - 1; //количество бьющих друг друга пар всегда меньше количества ладей на 1
        }
        return pairs;
    }
}
