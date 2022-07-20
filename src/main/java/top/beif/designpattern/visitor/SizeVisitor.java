package top.beif.designpattern.visitor;

import java.util.Iterator;

/**
 * @author 16116
 */
public class SizeVisitor extends Visitor {
    private int size = 0;

    public int getSize(){
        return size;
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            next.accept(this);
        }
    }
}
