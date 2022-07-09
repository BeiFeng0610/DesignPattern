package top.beif.designpattern.factory.simplefactory.pizzastore.pizza;

/**
 * @author 16116
 */
public abstract class Pizza {

    private String name;

    public abstract void prepare();

    public void back(){
        System.out.println(name + " back()");
    }

    public void cut(){
        System.out.println(name + " cur()");
    }

    public void box(){
        System.out.println(name + " box()");
    }

    public void setName(String name) {
        this.name = name;
    }
}
