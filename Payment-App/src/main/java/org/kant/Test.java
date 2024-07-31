package org.kant;

public class Test {
    public static void main(String[] args) {
        RestaurentService service =new RestaurentService(new DebitCardPayment());//CI
      // service.payment=new DebitCardPayment();//field injection
       // service.setPayment(new CreditCardPayment());//setter injection
        service.collectBill(501.07);
    }
}
