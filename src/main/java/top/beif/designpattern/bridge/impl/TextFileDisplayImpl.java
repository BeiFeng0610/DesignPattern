package top.beif.designpattern.bridge.impl;

import java.io.*;

/**
 * @author 16116
 */
public class TextFileDisplayImpl extends DisplayImpl {
    private String filename;
    private BufferedReader reader;
    private final int MAX_READAHEAD_LIMIT = 4096;

    public TextFileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=========================== " + filename + " ===========================");
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            reader.reset();
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawClose() {
        System.out.println("========================================");
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
