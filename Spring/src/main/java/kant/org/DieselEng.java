package kant.org;

public class DieselEng implements IEngine{
    @Override
    public int start() {
        System.out.println("Diesel Engine starting");
        return 1;
    }
}
