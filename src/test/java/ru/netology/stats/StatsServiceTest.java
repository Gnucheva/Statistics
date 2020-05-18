package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateAllSalesSum() {
        StatsService service = new StatsService();
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateAllSalesSum(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSum() {
        StatsService service = new StatsService();
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageSum(monthlySales);
        assertEquals(expected, actual);

    }

    @Test
    void MaxMonthSales() {
        StatsService service = new StatsService();
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.MaxMonthSales(monthlySales);
        assertEquals(expected, actual);

    }


}