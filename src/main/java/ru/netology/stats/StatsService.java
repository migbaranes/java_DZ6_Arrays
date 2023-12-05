package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public int sumAllSales(int[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        return summa;
    }

    //  средняя сумму продаж в месяц
    public int averageSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return (sum / sales.length);
    }

    /*номер месяца, в котором
     был пик продаж, то есть осуществлены
     продажи на максимальную сумму*/
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    /*номер месяца, в котором
     был пик продаж, то есть осуществлены
     продажи на минимальную сумму*/
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int monthlySalesAreBelowAverage(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        double average = (double) sum / sales.length;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    // количество месяцев, в которых продажи были выше среднего

    public int aboveAverageMonthlySales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        double average = (double) sum / sales.length;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}
