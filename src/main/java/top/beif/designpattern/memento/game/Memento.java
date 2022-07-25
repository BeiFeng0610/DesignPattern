package top.beif.designpattern.memento.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Memento角色会将Originator 角色的内部信息整合在一起。在Memento角色中虽然保存了Originator角色的信息， 但它不会向外部公开这些信息。
 * Memento角色有以下两种接口(AP!)。
 *
 *  1. wide interface-宽接口(AP!)
 *      Memento角色提供的＂宽接口(API)" 是指所有用千获取恢复对象状态信息的方法的集合。由于宽接口(API)会暴露所有Memento角色的内部信息， 因此能够使用宽接口(API)的只有Originator角色。
 *  2. narrow interface-窄接口(AP!)
 *      Memento角色为外部的Caretaker角色提供了＂窄接口(API) ”。可以通过窄接口(API)获取的Memento角色的内部信息非常有限， 因此可以有效地防止信息泄露。
 *
 * 通过对外提供以上两种接口(API)， 可以有效地防止对象的封装性被破坏。
 * @author 16116
 */
public class Memento implements Serializable {
    private static final long serialVersionUID = -7906757733345088768L;
    int money;
    ArrayList<String> fruits;

    public int getMoney(){
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits(){
        return (List<String>) fruits.clone();
    }
}
