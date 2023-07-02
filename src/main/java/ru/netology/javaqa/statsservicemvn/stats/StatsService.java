package ru.netology.javaqa.statsservicemvn.stats

public class StatsService {

    public int getTotalSales (int[] Sales) {
        int totalSales = 0;
        for ( int num : Sales) {
            totalSales = totalSales + num;
        }
        return totalSales;
    }

    public int getAverageSales (int[] Sales) {
        int average = getTotalSales(Sales);
        return average / Sales.length;
    }

    public int getMaxSales (int[] Sales) {
        int maxMonth = 0;

        for (int i = 0; i < Sales.length; i++) {
            if (Sales [i] >= Sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales (int[] Sales) {
        int minMonth = 0;

        for (int i = 0; i < Sales.length; i++) {
            if (Sales [i] <= Sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getSumLowerAverageMonths (int[] Sales) {
        int countBelow = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales [i] < getAverageSales(Sales)) {
                countBelow++;
            }
        }
        return countBelow;
    }

    public int getSumAboveAverageMonths (int[] Sales) {
        int countAbove = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales [i] >= getAverageSales(Sales)) {
                countAbove++;
            }
        }
        return countAbove;
    }
}


