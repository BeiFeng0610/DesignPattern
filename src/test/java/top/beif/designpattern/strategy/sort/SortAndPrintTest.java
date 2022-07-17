package top.beif.designpattern.strategy.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class SortAndPrintTest {

    @Test
    public void test(){
        String[] data = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
        SortAndPrint sap2 = new SortAndPrint(data, new QuickSorter());
        // sap.execute();
        sap2.execute();
    }

}