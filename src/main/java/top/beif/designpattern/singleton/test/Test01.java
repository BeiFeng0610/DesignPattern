package top.beif.designpattern.singleton.test;

/**
 * @author 16116
 */
public class Test01 {
    public static void main(String[] args) {
        TicketMaker instance = TicketMaker.getInstance();
        TicketMaker instance2 = TicketMaker.getInstance();
        System.out.println(instance.getNextTicketNumber());
        System.out.println(instance2.getNextTicketNumber());

    }
}

class TicketMaker{
    private int ticket = 1000;
    public static final TicketMaker INSTANCE = new TicketMaker();

    private TicketMaker(){}

    public static TicketMaker getInstance() {
        return INSTANCE;
    }

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
