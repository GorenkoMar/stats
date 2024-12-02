package ru.netology.stats.statsservice;

public class StatsService {

  public int amount(int[] sales) {

    int amount = 0;
    for (int i = 0; i < sales.length; i++) {
      amount += sales[i];
    }
    return amount;
  }

  public int averageAmount(int[] sales) {
    int amount = amount(sales);
    int averageAmount = amount / 12;
    return averageAmount;

  }

  public int minSales(int[] sales) {
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

  public int maxSales(int[] sales) {
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

  public int averageSalesMin(int[] sales) {
    int averageAmount = averageAmount(sales);
    int averageSalesMin = 0;
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] < averageAmount) {
        int j = 1;
        averageSalesMin += j;
      }
    }
    return averageSalesMin;
  }

  public int averageSalesMax(int[] sales) {
    int averageAmount = averageAmount(sales);
    int averageSalesMax = 0;
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] > averageAmount) {
        int j = 1;
        averageSalesMax += j;
      }
    }
    return averageSalesMax;
  }


}