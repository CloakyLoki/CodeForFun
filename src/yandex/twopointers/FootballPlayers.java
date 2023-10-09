package yandex.twopointers;

/**
 * Игрок в футбол обладает одной числовой характеристикой - профессионализмом. Команда называется сплоченной,
 * если профессионализм любого игрока не превосходит суммарный профессионализм двух любых других игроков из команды.
 * Команда может состоять из любого количества игроков.
 * Дана отсортированная последовательность чисел длиной N - профессионализм игроков.
 *
 * Необходимо найти максимальный суммарный профессионализм сплоченной команды.
 */
public class FootballPlayers {
//ToDo проверить. ХЗ, правильно ли.
    public static void main(String[] args) {
        int[] players = {1,1,3,3,6,11};
        System.out.println(bestTeamSum(players));
    }

    public static int bestTeamSum(int[] players){
        int bestSum = 0;
        int nowSum = 0;
        int last = 0;

        for (int first = 0; first < players.length - 1; first++){
            while (last < players.length && (players[first] + players[first + 1] >= players[last])){
                nowSum += players[last];
                last++;
            }
            bestSum = Math.max(bestSum, nowSum);
            nowSum -= players[first];
        }
        return bestSum;
    }
}
