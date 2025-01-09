import java.util.*;
class FeeDiscount
{
    public static void main(String []args)
    {
    double fee = 125000;
    double discount = 10;
    double discountedAmount = (discount / 100) * fee;
    double discountedPrice = fee - discountedAmount ;
    System.out.println("The discount amount is INR" + discountedAmount +" and final discounted fee is INR" + discountedPrice );
    }
}
