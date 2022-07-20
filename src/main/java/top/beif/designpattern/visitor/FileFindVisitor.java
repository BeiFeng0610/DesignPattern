package top.beif.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 16116
 */
public class FileFindVisitor extends Visitor {
    private String keyWord;
    private List<Entry> fount = new ArrayList<>();

    public FileFindVisitor(String keyWord) {
        this.keyWord = keyWord;
    }

    public Iterator<Entry> getFoundFiles(){
        return fount.iterator();
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(keyWord)) {
            fount.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
    }
}
