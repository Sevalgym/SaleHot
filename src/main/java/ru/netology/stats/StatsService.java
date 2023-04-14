package ru.netology.stats;

public class StatsService {
    // Метод для подсчёта суммы всех продаж
    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    // Метод для подсчёта средней суммы продаж в месяц
    public double calculateAverageSales(long[] sales) {
        long totalSales = calculateTotalSales(sales);
        return (double) totalSales / sales.length;
    }

    // Метод для нахождения номера месяца с наибольшими продажами
    public int findMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Метод для нахождения номера месяца с наименьшими продажами
    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Метод для подсчёта количества месяцев с продажами ниже среднего
    public int countMonthsBelowAverage(long[] sales) {
        double averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчёта количества месяцев с продажами выше среднего
    public int countMonthsAboveAverage(long[] sales) {
        double averageSales = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}