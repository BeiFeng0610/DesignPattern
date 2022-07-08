package top.beif.designpattern.singleton.test;

/**
 * @author 16116
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(Triple.getInstance(0));
        System.out.println(Triple.getInstance(1));
        System.out.println(Triple.getInstance(2));
    }
}

class Triple{

    public static final Triple[] INSTANCES = new Triple[]{
            new Triple(1),
            new Triple(2),
            new Triple(3),
    };
    private int id;

    private Triple(int id) {
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return INSTANCES[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
