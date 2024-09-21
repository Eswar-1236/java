class Test{
    //// arrays
    //// finding the lenght of arrays
    // public static void main(String[] args){
        // int[] a={10,20,30,40,50};
        // String s="eswar";
        // System.out.println(a.length);
        // System.out.println(s.length());
    //     int[] eid;
    //     eid=new int[23];
    //     System.out.println(eid.length);
    // }
    // one dimensional array(sum of one dimensinol array)
    public static void main(String[] args){
        // int[] a={10,20,30,40};
        // int s=0;
        // for (int i:a){
        //     s=s+i;
        // }
        // System.out.println(s);
        int[][] a;
        a=new int[3][3];
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;
        for (int[] i:a){
            // System.out.println(i);
            for (int x:i){
                System.out.println(x)
            }
        }
    }



    ////sum off two dimensinoal array
    // public static void main(String[] args){
    //     int[][] a={{10,20,30},{30,40,50},{60,70,80}};
    //     int sum=0;
    //     for (int[] i:a){
    //         for (int x:i){
    //             sum=sum+x;
    //         }
    //     }
    //     System.out.println(sum);

    // }

    // public static void m1(int a,int b,String c){
    //     System.out.println(c);
    // }

    // public static void main(String[] args){
    //     m1(10,20,"Eswar");
    // }

    //ananymous array (no need to mention the size)

    // public static void main(String[] args){
    //     getdata(new int[] {10,20,30,40});//ananymous array
    // }
    //     public static void getdata(int[] a){
    //     for (int i:a){
    //         System.out.println(i);
    //     }
    // }
}