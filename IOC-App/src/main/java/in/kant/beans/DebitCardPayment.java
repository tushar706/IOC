package in.kant.beans;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public class DebitCardPayment implements IPayment{
    public DebitCardPayment(){
       System.out.println("DebitCardPayment:: Constructor") ;
    }
    public boolean payBill(double amt) {
        System.out.println("Debit-Card payment processing...");
        return true;
    }
}
