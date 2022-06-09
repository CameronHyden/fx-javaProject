package com.example.fxjavaProject;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ReadFxCSVTest {

    List<Price> actual = ReadFxCSV.createPriceArray("src/main/Data/fx-data.csv");
    List<Price> expected = new ArrayList();


    @Before
    public void setUp() throws Exception {
        Price price1 = new Price(106, "EUR/USD", 1.1000, 1.2000, "01-06-2020 12:01:01:001");
        Price price2 = new Price(107, "EUR/JPY", 119.60, 119.90, "01-06-2020 12:01:01:001");
        Price price3 = new Price(108, "GBP/USD", 1.2500, 1.2560, "01-06-2020 12:01:01:001");
        Price price4 = new Price(109, "GBP/USD", 1.2499, 1.2561, "01-06-2020 12:01:01:001");
        Price price5 = new Price(110, "EUR/JPY", 119.61, 119.91, "01-06-2020 12:01:01:001");
        expected.add(price1);
        expected.add(price2);
        expected.add(price3);
        expected.add(price4);
        expected.add(price5);

    }

    @Test
    public void CSVReaderTest(){
        assertTrue(expected.size() == actual.size());

        }
}