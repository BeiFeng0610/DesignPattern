package top.beif.designpattern.chain_of_responsibility;

/**
 * 问题，带有编号
 * @author 16116
 */
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
