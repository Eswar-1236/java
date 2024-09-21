class testprivate{
    public static void main(String[] args){
        Account a=new Account();
        Account a1=new Account();

        a.set_acc_id(102);
        a.set_acc_name("Eswar");
        a1.set_acc_id(103);
        a1.set_acc_name("shiva");
        System.out.println(a.get_acc_id());
        System.out.println(a.get_acc_name());
        System.out.println(a1.get_acc_id());
        System.out.println(a1.get_acc_name());
    }
}