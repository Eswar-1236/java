//Extension Pack for Java v0.29.0
public class acount{
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    //double min_Bal=500.00;

    public acount(int id, String name, double amount){
        this.acc_Id = id;
        this.acc_Name = name;
        this.acc_Bal = amount;
    }
    public int get_acc_id(){
        return this.acc_Id;
    }
    public String get_acc_name(){
        return this.acc_Name;
    }
    public double get_acc_bal(){
        return this.acc_Bal;
    }
    public void open_Account(){}
    public boolean deposit_Amount(double amount){
        this.acc_Bal = this.acc_Bal + amount;
        return true;
        
    }
    public double get_Bal(){
        return this.acc_Bal;
        //return this.acc_Bal -this.min_Bal;
    }
    public static void main(String[] args) {
        acount a1=new acount(101,"Rahul",5000.50);
        a1.deposit_Amount(150.00);
        a1.deposit_Amount(50.00);
        // System.out.println(a1.get_Bal());
        System.out.println(a1.get_acc_id());
        System.out.println(a1.get_acc_name());
        System.out.println(a1.get_acc_bal());




    }
}