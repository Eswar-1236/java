interface user{
    void login();
    void logout();
}
interface users extends user{
    void forgottpassword();
}
class eswar implements users{
    public void login(){
        System.out.println("login succes");
    }
    public void logout(){
        System.out.println("log out success");
    }
    public void forgottpassword(){
        System.out.println("password updated");
    }
}
public class Innereswar {

    public static void main(String[] args) {
        eswar f1= new eswar();
        f1.login();
        f1.logout();
        f1.forgottpassword();

        
    }    
}