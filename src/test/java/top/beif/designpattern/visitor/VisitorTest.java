package top.beif.designpattern.visitor;


import org.junit.jupiter.api.Test;

import java.util.Iterator;

/**
 * @author 16116
 */
class VisitorTest {

    @Test
    public void test(){
        System.out.println("制作根条目...");

        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        rootDir.accept(new ListVisitor());

        System.out.println();
        System.out.println("制作用户条目...");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");
        usrDir.add(yuki);
        usrDir.add(hanako);
        usrDir.add(tomura);
        yuki.add(new File("diary.html", 100));
        yuki.add(new File("Composite.java", 200));
        hanako.add(new File("memo.tex", 300));
        hanako.add(new File("index.html", 350));
        tomura.add(new File("game.doc", 400));
        tomura.add(new File("iunk.mail", 500));
        rootDir.accept(new ListVisitor());
        System.out.println("HTML files are:");
        FileFindVisitor ffv = new FileFindVisitor(".html");
        ffv.visit(rootDir);
        Iterator<Entry> foundFiles = ffv.getFoundFiles();
        while (foundFiles.hasNext()) {
            Entry entry = foundFiles.next();
            System.out.println(entry);
        }
    }

    @Test
    public void test02(){
        Directory root1 = new Directory("root1");
        root1.add(new File("diary.html", 10));
        root1.add(new File("index.html", 20));

        Directory root2 = new Directory("root2");
        root2.add(new File("diary.html", 1000));
        root2.add(new File("index.html", 2000));

        ElementArrayList list = new ElementArrayList();
        list.add(root1);
        list.add(root2);
        list.add(new File("etc.html", 1234));

        list.accept(new ListVisitor());
    }

}