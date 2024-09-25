class p1{
    p1(String a){
        // this.a=a;
        System.out.println("parent   "+a);
    }
}
class p2 extends p1{
    p2(String cname,String fname){
        super(fname);
        System.out.println("child   "+cname);
    }
}

public class supe2 {
    public static void main(String[] args) {
        new p2("rahul","rajeev");
    }
}
