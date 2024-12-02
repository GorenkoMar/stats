package ru.netology.stats.statsservice;

public class StatsService {

  public int amount(long[] sales) {
    int amount = 0;
    for (long sale : sales) {
      amount += sale;
    }
    return amount;
  }

  public int averageAmount(long[] sales) {
    int amount = amount(sales);
    int averageAmount = amount / 12;
    return averageAmount;
  }

  public int minSales(long[] sales) {
    int minMonth = 0;
    for (int i = 0; i < sales.length; i++) {
      for (int j = i + 1; j < sales.length; j++) {
        if (sales[i] <= sales[minMonth]) {
          minMonth = i;
        }
      }
    }
    return minMonth + 1;
  }

  public int maxSales(long[] sales) {
    int maxMonth = 0;
    for (int i = 0; i < sales.length; i++) {
      for (int j = i; j < sales.length; j++) {
        if (sales[i] >= sales[maxMonth]) {
          maxMonth = i;
        }
      }
    }
    return maxMonth + 1;
  }

  public int averageSalesMin(long[] sales) {
    int averageAmount = averageAmount(sales);
    int averageSalesMin = 0;
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] < averageAmount) {
        averageSalesMin += 1;
      }
    }
    return averageSalesMin;
  }

  public int averageSalesMax(long[] sales) {
    int averageAmount = averageAmount(sales);
    int averageSalesMax = 0;
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] > averageAmount) {
        averageSalesMax += 1;
      }
    }
    return averageSalesMax;
  }
}