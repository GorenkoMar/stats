package ru.netology.stats.statsservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

  @Test
  public void testSum() {
    StatsService statsService = new StatsService();

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedAmount = 180;
    int actualAmount = statsService.amount(sales);
    Assertions.assertEquals(expectedAmount, actualAmount);
  }

  @Test
  public void testAverage() {
    StatsService statsService = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedaverageAmount = 15;
    int actualaverageAmount = statsService.averageAmount(sales);
    Assertions.assertEquals(expectedaverageAmount, actualaverageAmount);
  }

  @Test
  public void testMinSales() {
    StatsService statsService = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedminSales = 9;
    int actualminSales = statsService.minSales(sales);
    Assertions.assertEquals(expectedminSales, actualminSales);
  }

  @Test
  public void testMaxSales() {
    StatsService statsService = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedmaxSales = 8;
    int actualmaxSales = statsService.maxSales(sales);
    Assertions.assertEquals(expectedmaxSales, actualmaxSales);
  }

  @Test
  public void testAverageSalesMin() {
    StatsService statsService = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedaverageSalesMin = 5;
    int actualaverageSalesMin = statsService.averageSalesMin(sales);
    Assertions.assertEquals(expectedaverageSalesMin, actualaverageSalesMin);
  }

  @Test
  public void testAverageSalesMax() {
    StatsService statsService = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedaverageSalesMax = 5;
    int actualaverageSalesMax = statsService.averageSalesMax(sales);
    Assertions.assertEquals(expectedaverageSalesMax, actualaverageSalesMax);
  }


}
