package ru.netology.stats.Statistics.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.getMinSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void findAmountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAverageAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.getAverageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void findBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
