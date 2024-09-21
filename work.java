// abstract class Account{
//     public abstract void open_ac();
//     public abstract void close_ac();
//     public abstract void min_bal();
// }
// class Savings_ac extends Account{
//     public void close_ac(){};
//     public void open_ac(){
//         System.out.println("please fill form below");
//     }
//     public void min_bal(){
//         System.out.println("MIN-BAL :2000");
//     }
//     public static void main(String[] args){
//         Savings_ac obj=new Savings_ac();
//         obj.min_bal();
//         obj.open_ac();
//         obj.close_ac();
//     }
// }

// interface Account{
//     void open_ac();
//     // void close_ac();
//     void min_bal();
// }
// class B implements Account{
//     public void open_ac(){
//         System.out.println("ur account opend sucesfully");
//     }
//     public void min_bal(){
//         System.out.println("sucesfully 1000");
//     }
//     public static void main(String[] args){
//         B obj=new B();
//         obj.open_ac();
//         obj.min_bal();
//     }
// }