package in.kant.beans;

public class RestaurantService {
    private IPayment payment;
    public RestaurantService(){
        System.out.println("ResturantService ::0-parm-constructor");
    }
    public RestaurantService(IPayment payment){
        System.out.println("ResturantService ::parm-constructor");
        this.payment=payment;

    }
    public void setPayment(IPayment payment){
        System.out.println("setter method called");
        this.payment=payment;
    }
    public void processPayment(double amt){
        boolean status = payment.payBill(amt);
        if(status){
            System.out.println("payment completed");
        }else{
            System.out.println("payment failed");
        }
    }
}
