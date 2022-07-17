package top.beif.designpattern.strategy;

import org.junit.jupiter.api.Test;

/**
 * @author 16116
 */
class PlayerTest {

    @Test
    public void test(){
        int seed1 = 14;
        int seed2 = 15;
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));
        for (int i = 0; i < 100; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                player1.win();
                player2.lose();
                System.out.println("Winner：" + player1);
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                player1.lose();
                player2.win();
                System.out.println("Winner：" + player2);
            } else {
                player1.even();
                player2.even();
                System.out.println("Even...");
            }
        }
        System.out.println("Total result：");
        System.out.println(player1);
        System.out.println(player2);
    }

}