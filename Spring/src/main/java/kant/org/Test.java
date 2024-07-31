package kant.org;

public class Test {
    public static void main(String[] args){
        Car c= new Car(new DieselEng());//obj creation with ci
       // c.setEng(new DieselEng());
        c.drive();
    }
}
