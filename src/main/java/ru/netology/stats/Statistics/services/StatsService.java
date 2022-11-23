package ru.netology.stats.Statistics.services;

public class StatsService {

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int getSalesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int getAverageAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int getBelowAverage(int[] sales) {
        int below = 0;
        int average = getAverageAmount(sales);
        for (int sale : sales) {
            if (sale < average) {
                below++;
            }
        }
        return below;
    }

    public int getAboveAverage(int[] sales) {
        int above = 0;
        int average = getAverageAmount(sales);
        for (int sale : sales) {
            if (sale > average) {
                above++;
            }
        }
        return above;
    }
}