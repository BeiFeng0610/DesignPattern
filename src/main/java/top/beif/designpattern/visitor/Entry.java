package top.beif.designpattern.visitor;

import java.util.Iterator;

/**
 * @author 16116
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatMeantException {
        throw new FileTreatMeantException();
    }

    public Iterator<Entry> iterator()throws FileTreatMeantException {
        throw new FileTreatMeantException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
