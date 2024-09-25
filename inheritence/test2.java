
//multilevel inheritence
class grand_parent{
    public void m1(){
        System.out.println("grand patrent class m1");
    }
    public void m2(){
        System.out.println(" grand patrent class m2");

    }

}
class parent extends grand_parent{
    public void m3(){
        System.out.println("patrent class m3");

    }

}
class child extends parent{

    public void m4(){
        System.out.println("child class m4");

    }
}

class testtwo{
    public static void main(String[] args) {
        child a= new child();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
    }
}