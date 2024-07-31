package in.kantit;

public class UserService  {
    UserDao dao= new UserDao();
    public void printUserName(Integer id){
     String uname= dao.getUserNameById(id);
     System.out.println(uname);
    }
}
