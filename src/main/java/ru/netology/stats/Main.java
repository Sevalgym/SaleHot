package ru.netology.stats;

public class Main {

    public static void main(String[] args) {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Сумма всех продаж: " + statsService.calculateTotalSales(sales));
        System.out.println("Средняя сумма продаж в месяц: " + statsService.calculateAverageSales(sales));
        System.out.println("Номер месяца, в котором был пик продаж: " + statsService.findMaxSalesMonth(sales));
        System.out.println("Номер месяца, в котором был минимум продаж: " + statsService.findMinSalesMonth(sales));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + statsService.countMonthsBelowAverage(sales));
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + statsService.countMonthsAboveAverage(sales));
    }
}