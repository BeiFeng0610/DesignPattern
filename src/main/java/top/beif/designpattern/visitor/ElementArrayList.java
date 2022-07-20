package top.beif.designpattern.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author 16116
 */
public class ElementArrayList extends ArrayList<Element> implements Element {

    @Override
    public void accept(Visitor v) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element e = it.next();
            e.accept(v);
        }
    }
}
