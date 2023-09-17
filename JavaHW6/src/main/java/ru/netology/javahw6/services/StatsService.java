package ru.netology.javahw6.services;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }


    public int averageSales(int[] sales) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return average = sum / sales.length;
    }


    public int maxMonth(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int minMonth(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsUnderAverageSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        int average = sum / sales.length;

        int sumMonthsUnderAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                sumMonthsUnderAverageSales += 1;
            }
        }
        return sumMonthsUnderAverageSales;
    }


    public int monthsAboveAverageSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        int average = sum / sales.length;

        int sumMonthsAboveAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                sumMonthsAboveAverageSales += 1;
            }
        }
        return sumMonthsAboveAverageSales;
    }
}






