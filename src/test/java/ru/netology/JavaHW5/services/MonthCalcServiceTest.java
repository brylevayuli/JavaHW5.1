package ru.netology.JavaHW5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.JavaHW5.services.MonthCalcService;


public class MonthCalcServiceTest {

    @Test
    public void testForThreeMonthOfRest() {
        MonthCalcService service = new MonthCalcService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;
        int actual = service.calcMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testForTwoMonthOfRest() {
        MonthCalcService service = new MonthCalcService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;
        int actual = service.calcMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}
