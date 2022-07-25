package top.beif.designpattern.memento.game;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.concurrent.CompletableFuture;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class GamerTest {
    public static final String SAVEFILENAME = "game.dat";

    @Test
    public void test(){

        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();

        if (memento != null) {
            System.out.println("读取上次存档开始游戏。");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新游戏。");
            memento = gamer.createMemento();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("当前游戏：" + gamer);

            gamer.bet();
            System.out.println("所持金钱为：" + gamer.getMoney() + " 元。");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (所持有金钱增加了许多，因此保存游戏当前的状态)");
                memento = gamer.createMemento();
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    (所持金钱减少了许多，因此将游戏恢复至以前的状态)");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println();
        }


    }

    public static void saveMemento(Memento memento) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new DeflaterOutputStream(new FileOutputStream(SAVEFILENAME)));
            oos.writeObject(memento);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static Memento loadMemento(){
        Memento memento = null;
        try {
            ObjectInputStream oi = new ObjectInputStream(new InflaterInputStream(new FileInputStream(SAVEFILENAME)));
            memento = (Memento) oi.readObject();
            oi.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("文件不存在。");
            return null;
        }
        return memento;
    }
}
