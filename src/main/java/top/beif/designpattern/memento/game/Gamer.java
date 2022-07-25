package top.beif.designpattern.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Originator角色会在保存自己的最新状态时生成Memento角色。当把以前保存的Memento角色
 * 传递给Originator角色时， 它会将自己恢复至生成该Memento角色时的状态。
 * @author 16116
 */
public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsName = {
            "苹果", "葡萄", "香蕉", "橘子"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public void bet(){
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金钱增加了。");
        } else if (dice == 2){
            money /= 2;
            System.out.println("所持金钱减半了。");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得了水果(" + f + ")。");
            fruits.add(f);
        } else {
            System.out.println("什么都没有发生。");
        }
    }

    public Memento createMemento(){
        Memento m = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("好吃的")) {
                m.addFruit(fruit);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }

    private String getFruit(){
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
