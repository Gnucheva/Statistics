package ru.netology.stats;

public class StatsService {
    public int calculateAllSalesSum(int[] monthlySales) {
        int AllSalesSum = 0;
        for (int monthlySale : monthlySales) {
            AllSalesSum += monthlySale;
        }
        return AllSalesSum;

    }
}
