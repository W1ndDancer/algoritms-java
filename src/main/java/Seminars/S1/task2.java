package Seminars.S1;

import java.util.ArrayList;
import java.util.List;

/**
 * Найти все простые число от 1 до n (и распечатать их в консоль).
 */

public class task2 {
    public static void main(String[] args) {
        System.out.println(findPrimeNumbers(20));
    }

    public static List<Integer> findPrimeNumbers(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                res.add(i);
            }
        }
        return res;
    }
}
