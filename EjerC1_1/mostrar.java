public class mostrar {
    public static void main(String[] args) {
        // int x = 10;
        // System.out.println(x);//10
        // x--;//9
        // System.out.println(x);//9
        // System.out.println(--x);// imp 8  x=8
        // System.out.println(x--);//imp 8 x=7
        // System.out.println(x);//imp 7
        // System.out.println(x--);// imp 7 x=6
        // System.out.println(--x);// imp 5 x=5
        // System.out.println(--x);// imp 4 x=4
        // int x = 10;
        // ++x;//11 
        // System.out.println(++x);//imp=12     x=12
        // System.out.println(x++);//imp=12     x=13
        // System.out.println(++x);//imp=14      x=14
        // System.out.println(x);// imp 14 x=14
        // x++;//15
        // System.out.println(x);//15
        // System.out.println(++x);//16
        // System.out.println(x++);// imp 16, x=17
        // System.out.println(x);//17
        // System.out.println(x++);//17 x=18
        // System.out.println(++x);//19 
        // System.out.println(++x);//20
        // ++x; //21
        // x++;//22
        // System.out.println(++x);//23
        // System.out.println(x++);//23 x=24
        // System.out.println(++x);//25 x=25
        char A = 'c';
        char B;
        System.out.println(A++);// imp c A=d
        System.out.println(A++);// imp d A=e
        System.out.println(++A);//imp f A=f
        B = --A;// B=e  A=e
        System.out.println(++A);//f A=f
        A++;//g
        --B;//d
        System.out.println(B++);//d B=e
        System.out.println(++B);//f B=f
        System.out.println(++A);//h A=h
        System.out.println(B--);//f B=e
        System.out.println(A);//h
        System.out.println(B);//e
    }
    
}
