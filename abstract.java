// //every java class parent class is object class 
// //multipule inheritence is not possible
// //abstract class contains concrete and non concrete methods

// abstract class Account{
//     public void open_ac(){
//     }
//     public abstract int get_bal(){
//     }
// }
// class sa extends Account{
//     public int get_bal(){
//         // System.out.println("100");
//         return 100;
//     }
//     public static void main(String[] args){
//         //Accountobj=new Account();//we can't create object for abstract class
//         sa obj=new sa();
//         obj.open_ac();
//         int bal=obj.get_bal();
//         System.out.println(bal);
//     }
// }