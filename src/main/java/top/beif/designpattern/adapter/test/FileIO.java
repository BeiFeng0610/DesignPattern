package top.beif.designpattern.adapter.test;

import java.io.IOException;

/**
 * @author 16116
 */
public interface FileIO {
    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
