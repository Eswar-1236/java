
class parent{
    public void m1(){
        System.out.println("parent m1");

    }
    public void m2(){
        System.out.println("parent m2");

    }
}
class child extends parent{
    public void m3(){
        System.out.println("child m3");
    }
}

class test3{
    public static void main(String[] args) {
        parent foo = new parent();
        foo.m1();
        foo.m2();
        //foo.m3();
        child foo1 = new child();
        foo1.m1();
        foo1.m2();
        foo1.m3();
        parent fp2=new child();
        fp2.m1();
        fp2.m2();
        //fp2.m3();
        //child fp3=new parent();// incompatible types: parent cannot be converted to child


        
        
    }
}