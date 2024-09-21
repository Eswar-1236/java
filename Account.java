//class is a template or
//four pillars of OOPS
//abstraction,Encapsulation,Inheritence,Polymorphism
//Encapsulation-->binding data and methods as single unit
public class Account{
    private int acc_id;
    private String acc_name;
    // private double acc_bal;
    public void set_acc_id(int id){
        this.acc_id=id;
    }
    public int get_acc_id(){
        return this.acc_id;
    }
    public void set_acc_name(String name){
        this.acc_name=name;
    }
    public String get_acc_name(){
        return this.acc_name;
    }
}