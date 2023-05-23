public class StatService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;

        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }
    
    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        long saleMin = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }
    
    public int monthsSalesBellowAverage(long[] sales) {
        long averageSale = average(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                result++;
            }
        }
        return result;
    }

    public int monthsSalesUnderAverage(long[] sales) {
        long averageSale = average(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                result++;
            }
        }
        return result;
    }
}
