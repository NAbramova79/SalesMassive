package ru.netology.javaqa.statsservicemvn.stats

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldGetTotalSales() {
        StatsService service = new StatsService();

        int[] Sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedTotal = 180;
        int actualTotal = service.getTotalSales(Sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void shouldGetAverageSales() {
        StatsService service = new StatsService();

        int[] Sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedAverage = 15;
        int actualAverage = service.getAverageSales(Sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldGetMonthWithMaxSales() {
        StatsService service = new StatsService();

        int[] Sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxSales(Sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldGetMonthWithMinSales() {
        StatsService service = new StatsService();

        int[] Sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinSales(Sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldCountMonthsIfBelowAverage() {
        StatsService service = new StatsService();

        int[] Sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedCountBelow = 5;
        int actualCountBelow = service.getSumLowerAverageMonths(Sales);

        Assertions.assertEquals(expectedCountBelow, actualCountBelow);
    }

    @Test
    public void shouldCountMonthsIfAboveAverage() {
        StatsService service = new StatsService();

        int[] Sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedCountAbove = 7;
        int actualCountAbove = service.getSumAboveAverageMonths(Sales);

        Assertions.assertEquals(expectedCountAbove, actualCountAbove);
    }
}
