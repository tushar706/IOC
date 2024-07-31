package kant.org;

public class Car {
   IEngine eng;  //eng =null

    public Car(IEngine eng ){
        this.eng =eng;
    }

    public void setEng(IEngine eng){
        this.eng=eng;
    }
    public void drive(){
        int status=eng.start();
        if(status>0){
            System.out.println("Journey started");
        }else{
            System.out.println("Engine fault");
        }


    }
}
