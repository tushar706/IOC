package org.kant;

public class RestaurentService {

    IPayment payment;
    public RestaurentService(IPayment payment){
        this.payment=payment;
    }
    public void setPayment(IPayment payment){
        this.payment=payment;
    }
    public void collectBill(double amt){
       boolean status= payment.payBill(amt);
       if(status){
           System.out.println("payment success thankyou");
       }else{
           System.out.println("card declined");
       }
    }
}
