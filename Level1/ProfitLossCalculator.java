import java.util.*;
class ProfitLossCalculator
{
    public static void main(String []args)
    {
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + "\n" +
            "The Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + "\n" +
            "The Profit Percentage is: " + profitPercentage + "%");
    }
}
