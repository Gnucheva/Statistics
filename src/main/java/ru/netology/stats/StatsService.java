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
        int month = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] >= monthlySales[month])
                month = i;
        }
        return month;

    }

    public int MinMonthSales(int[] monthlySales) {
        int month = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] < monthlySales[month])
                month = i;
        }
        return month;
    }

    public int MinMonthsAverage(int[] monthlySales) {
        int Average = calculateAverageSum(monthlySales);
        int month = 0;
        for (int monthlySale : monthlySales) {
            if (Average > monthlySale) {
                month += 1;
            }
        }
        return month;


    }

    public int MaxMonthsAverage(int[] monthlySales) {
        int Average = calculateAverageSum(monthlySales);
        int month = 0;
        for (int monthlySale : monthlySales) {
            if (Average < monthlySale) {
                month += 1;
            }
        }
        return month;
    }


}




