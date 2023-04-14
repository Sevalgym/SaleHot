package ru.netology.stats;

public class StatsService {

    public int calculateTotalSales(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public int calculateAverageSales(int[] sales) {
        return calculateTotalSales(sales) / sales.length;
    }

    public long calculateMonthOfMaxSales(int[] sales) {
        int maxSale = sales[0];
        int maxSaleMonth = 1;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSaleMonth = i + 1;
            }
        }
        return maxSaleMonth;
    }

    public int findMonthWithMinSales(int[] sales) {
        int minSale = sales[0];
        int minSaleMonth = 1;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSale) {
                minSale = sales[i];
                minSaleMonth = i + 1;
            }
        }
        return minSaleMonth;
    }

    public int calculateMonthsBelowAverageSales(int[] sales) {
        int averageSales = calculateAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int countMonthsAboveAverageSales(int[] sales) {
        double average = calculateAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}