package study;

class A5 {
    int m = 3;
}
class B5 extends A5{
    int m =4;
}
public class OverlapInstanceField {
    public static void main(String[] args) {
        A5 aa = new A5();
        B5 bb = new B5();
        A5 ab = new B5();

        System.out.println(aa.m);
        //3
        System.out.println(bb.m);
        //4
        System.out.println(ab.m);
        //3
    }
}
