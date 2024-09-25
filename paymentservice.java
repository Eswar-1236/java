
public class paymentservice{
    private String status;
    public void set_status(String st){
        this.status=st;
    }
    public String get_status(){
        return this.status;
    }
    //we can inside the class like this
    // public static void main(String[] args){
    //     paymentservices obj=new paymentservices();
    //     obj.set_status("eeeee");
    //     System.out.println(obj.get_status());
    // }

}