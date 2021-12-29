package study;

class A {
    int m = 3;
    void print(){
        System.out.println("객체 생성 및 활용");
    }
}

public class classAndObject {
    public static void main(String[] args) {

        A a = new A();

        a.m = 5;
        System.out.println(a.m);

        a.print();
    }
}
