package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedsumm = 180;
        int actualsumm = service.sumAllSales(sales);

        Assertions.assertEquals(expectedsumm, actualsumm);
    }

    @Test
    public void shouldAverageAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldNumberMonthMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumber = 8;
        int actualNumber = service.maxSales(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void shouldNumberMonthMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumber = 9;
        int actualNumber = service.minSales(sales);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void shouldNumberMonthBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberMonth = 5;
        int actualNumberMonth = service.monthlySalesAreBelowAverage(sales);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);
    }

    @Test
    public void shouldNumberMonthAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberMonth = 5;
        int actualNumberMonth = service.aboveAverageMonthlySales(sales);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);
    }
}