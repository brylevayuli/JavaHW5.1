package ru.netology.JavaHW5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.JavaHW5.services.MonthCalcService;


public class MonthCalcServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000",
//    })

    @CsvFileSource(files = "src/test/resources/month.csv")
    public void testForThreeMonthOfRest(int expected, int income, int expenses, int threshold) {
        MonthCalcService service = new MonthCalcService();


//        int expected = 3;
        int actual = service.calcMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

//    @Test
//    public void testForTwoMonthOfRest() {
//        MonthCalcService service = new MonthCalcService();
//
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//
//        int expected = 2;
//        int actual = service.calcMonth(income, expenses, threshold);
//
//        Assertions.assertEquals(expected, actual);
//
//    }
}
