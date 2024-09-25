class parent{
    public void m1(){
        System.out.println("parent class m1");
    }
    public void m2(){
        System.out.println("parent class m2");
    }
        
}
class child extends parent{
    public void m3(){
        System.err.println("child method");
    }

}
class test_one{
    public static void main(String[] args) {
        child a=new child();
        a.m1();
        a.m2();
        a.m3();
    }
}