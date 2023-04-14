import org.junit.Test;
import ru.netology.stats.StatsService;

import static org.junit.Assert.assertEquals;

public class StatsServiceTest {
    @Test
    public void testCalculateTotalSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedTotalSales = 180;
        long actualTotalSales = statsService.calculateTotalSales(sales);
        assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void testCalculateAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15.0;
        StatsService statsService = new StatsService();
        double actual = statsService.calculateAverageSales(sales);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindMaxSalesMonth() {
        StatsService statsService = new StatsService();
        long[] sales = {1000, 2000, 3000, 2500, 1500, 4000, 6000, 3500, 4500, 5000, 5500, 7000};
        int expectedMaxMonth = 12;
        int actualMaxMonth = statsService.findMaxSalesMonth(sales);
        assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void testFindMinSalesMonth() {
// Создание экземпляра StatsService
        StatsService statsService = new StatsService();

        // Входные данные
        long[] sales = {5000, 4000, 3000, 2000, 1000};

        // Ожидаемый результат
        int expectedMinMonth = 5;

        // Вызов метода findMinSalesMonth
        int actualMinMonth = statsService.findMinSalesMonth(sales);

        // Сравнение ожидаемого и реального результатов
        assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void testCountMonthsBelowAverage() {
        // Создаем объект класса StatsService
        StatsService service = new StatsService();
        // Создаем массив с данными о продажах за месяц
        long[] sales = {10, 20, 30, 40, 50};

        // Считаем количество месяцев с продажами ниже среднего
        int count = service.countMonthsBelowAverage(sales);

        // Проверяем, что количество месяцев с продажами ниже среднего равно 2
        assertEquals(2, count);
    }

    @Test
    public void testCountMonthsAboveAverage() {
        // Создаем экземпляр StatsService
        StatsService statsService = new StatsService();
        // Создаем массив с данными о продажах за каждый месяц
        long[] sales = {100, 200, 300, 400, 500, 600};

        // Проверяем, что метод countMonthsAboveAverage правильно подсчитывает количество месяцев
        // с продажами выше среднего
        int expectedCount = 3;
        int actualCount = statsService.countMonthsAboveAverage(sales);
        assertEquals(expectedCount, actualCount);
    }
}