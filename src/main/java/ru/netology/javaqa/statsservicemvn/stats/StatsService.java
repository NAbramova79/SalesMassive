package ru.netology.javaqa.statsservicemvn.stats;

public class StatsService {

    public int getTotalSales (int[] sales) {
        int totalSales = 0;
        for ( int num : sales) {
            totalSales = totalSales + num;
        }
        return totalSales;
    }

    public int getAverageSales (int[] sales) {
        int average = getTotalSales(sales);
        return average / sales.length;
    }

    public int getMaxSales (int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales [i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales (int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales [i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getSumBelowAverageMonths (int[] sales) {
        int average = getAverageSales(sales);
        int countBelow = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales [i] < average) {
                countBelow++;
            }
        }
        return countBelow;
    }

    public int getSumAboveAverageMonths (int[] sales) {
        int average = getAverageSales(sales);
        int countAbove = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales [i] >= average) {
                countAbove++;
            }
        }
        return countAbove;
    }
}


