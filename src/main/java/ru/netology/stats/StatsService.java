package ru.netology.stats;

public class StatsService {
    public int calculateAllSalesSum(int[] monthlySales) {
        int AllSalesSum = 0;
        for (int monthlySale : monthlySales) {
            AllSalesSum += monthlySale;
        }
        return AllSalesSum;

    }

    public int calculateAverageSum(int[] monthlySales) {
        int AllSalesSum = 0;
        for (int monthlySale : monthlySales) {
            AllSalesSum += monthlySale;
        }
        return AllSalesSum / monthlySales.length;

    }

    public int MaxMonthSales(int[] monthlySales) {
        if (monthlySales == null || monthlySales.length == 0) return -1;
        int month = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] >= monthlySales[month]) month = i;
        }
        return month;
    }


}



