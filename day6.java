class Account{
    // int acc_Id;
    // String acc_name;
    // double acc_bal;
    // static double min_bal=2000;
    // static String branch_name="SBI";
    // public static void main(String[] args){
    //     Account a1=new Account();
    //     Account a2=new Account();
    //     Account a3=new Account();
    //     System.out.println(a1.acc_Id);
    //     System.out.println(a1.acc_name);
    //     System.out.println(Account.min_bal);
    //     System.out.println(min_bal);
    // }

    // //INSTACE VARIBALE
    // int a=10;
    // public static void main(String[] args){
    //    int c=200;
    //    System.out.println(a); //error: non-static variable a cannot be referenced from a static context
        // Account a1=new Account();//we can acces insatce variable by creating object only
        // System.out.println(a1.a);


    // }

    public void m1(){
        int a=10;
        System.out.println(a);

    }
    public void m2(String[] args){
        m1();
        System.out.println(a);
    }

}