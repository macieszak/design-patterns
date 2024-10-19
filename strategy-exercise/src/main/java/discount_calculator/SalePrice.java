package discount_calculator;

public class SalePrice implements PricingStrategy {


    @Override
    public void calculatePrice(double price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            price *= 0.5;
            System.out.println("Cena po obniżce 50% : " + price);
        } else {
            System.out.println("Wartość isSignedUpForNewsletter jest nieprawdiłowa: " + isSignedUpForNewsletter);
        }
    }

}
