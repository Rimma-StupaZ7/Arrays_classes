package ru.netology.stats.service;

public class StatsService {
    public long salessum(long[] sales) {
        long allsales = 0;
        for (long sale : sales) {
            allsales = allsales + sale;
        }
        return allsales;
    }

    public long averagesales(long[] sales) {
        return salessum(sales) / sales.length;
    }

    public int monthMaxsales(long[] sales) {
        int monthMax = 0;
        long salesMax = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= salesMax) {
                monthMax = i;
                salesMax = sales[i];
            }
        }
        return monthMax + 1;
    }

    public int monthMinsales(long[] sales) {
        int monthMin = 0;
        long salesMin = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= salesMin) {
                monthMin = i;
                salesMin = sales[i];
            }
        }
        return monthMin + 1;
    }

    public int monthBelowAverageSales(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (averagesales(sales) > sale) {
                result = result + 1;
            }
        }
        return result;
    }

    public int monthOverAverageSales(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (averagesales(sales) < sale) {
                result = result + 1;
            }
        }
        return result;
    }
}
