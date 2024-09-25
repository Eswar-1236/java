// //class-interface
interface daio{
    void login();
    void logout();
}
interface usi{
    void forgottpassword();
}
class daioimpl implements daio,usi{
    public void login(){
        System.out.println("login success");
    }
    public void logout(){
        System.out.println("log out success");
    }
    //void forgottpassword(){}//attempting to assign weaker access privileges; was public
    public void forgottpassword(){
        System.out.println("password update succesfully");
    }

}
// public class multi{
//     public static void main(String[] args) {
//         daioimpl f1= new daioimpl();
//         f1.login();
//         f1.logout();
//         f1.forgottpassword();
        
//     }
// }
