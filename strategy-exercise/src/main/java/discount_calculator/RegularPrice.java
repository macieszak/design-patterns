package discount_calculator;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(double price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("Cena regularna: " + price);
        } else {
            System.out.println("Wartość isSignedUpForNewsletter jest nieprawdiłowa: " + isSignedUpForNewsletter);
        }
    }

}
