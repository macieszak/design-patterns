package discount_calculator;

public interface PricingStrategy {

    void calculatePrice(double price, boolean isSignedUpForNewsletter);


}
