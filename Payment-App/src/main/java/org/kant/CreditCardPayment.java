package org.kant;

public class CreditCardPayment implements IPayment{
    public boolean payBill(double amt) {
        System.out.println("credit card payment processing");
        return true;
    }
}
