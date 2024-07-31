package org.kant;

public class DebitCardPayment implements IPayment {
    public boolean payBill(double amt) {
        System.out.println("debitcard payment processing....");
        return true;
    }
}
