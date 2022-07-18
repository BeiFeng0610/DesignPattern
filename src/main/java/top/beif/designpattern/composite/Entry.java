package top.beif.designpattern.composite;

/**
 * @author 16116
 */
public abstract class Entry {
    protected Entry parent;
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatMeantException {
        throw new FileTreatMeantException();
    }

    public void printList(){
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "  (" + getSize() + ")";
    }

    public String getFullName(){
        StringBuilder fullname = new StringBuilder();
        Entry entry = this;
        do {
            fullname.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return fullname.toString();
    }
}
