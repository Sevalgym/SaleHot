package ru.netology.stats;

public class Main {

    public static void main(String[] args) {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Сумма всех продаж: " + statsService.calculateTotalSales(sales));
        System.out.println("Средняя сумма продаж в месяц: " + statsService.calculateAverageSales(sales));
        System.out.println("Номер месяца, в котором был пик продаж: " + statsService.calculateMonthOfMaxSales(sales));
        System.out.println("Номер месяца, в котором был минимум продаж: " + statsService.findMonthWithMinSales(sales));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + statsService.calculateMonthsBelowAverageSales(sales));
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + statsService.countMonthsAboveAverageSales(sales));
    }
}