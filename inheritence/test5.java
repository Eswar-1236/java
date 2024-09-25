interface p1{
    public abstract void m1();
}
interface p2{
    public abstract void m2();
    
}
class child implements p1,p2{
    public void m1(){
        System.out.println("interface p1 m3");
    }
    public void m2(){
        System.out.println("interface p2 m2");
    }
}
class test5{
    public static void main(String[] args) {
        child foo = new child();
        foo.m1();
        foo.m2();
        
        
    }
}