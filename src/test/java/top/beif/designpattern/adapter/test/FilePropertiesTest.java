package top.beif.designpattern.adapter.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class FilePropertiesTest {

    @Test
    public void Test(){
        FileIO f = new FileProperties();

        try {
            f.readFromFile("src/test/java/top/beif/designpattern/adapter/test/file.txt");
            System.out.println(f.getValue("year"));
            f.setValue("year", "2022");
            f.setValue("month", "7");
            f.setValue("day", "11");
            f.writeToFile("src/test/java/top/beif/designpattern/adapter/test/newfile.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}