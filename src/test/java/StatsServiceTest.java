import org.junit.Test;
import ru.netology.stats.StatsService;

import static org.junit.Assert.assertEquals;

public class StatsServiceTest {

    @Test
    public void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateTotalSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long actual = service.calculateMonthOfMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int monthOfMinSales = service.findMonthWithMinSales(sales);

        assertEquals(9, monthOfMinSales);
    }
}