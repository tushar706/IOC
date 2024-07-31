package in.kant.beans;

public class CreditCardPayment implements IPayment{
    public CreditCardPayment() {
        System.out.println("creditcard payment::constructor");
    }

    public boolean payBill(double amt) {
        System.out.println("Credit card payment processing...");
        return true;
    }
}
