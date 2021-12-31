package study;
class A3{
    void abc(){
        System.out.println("instance 메서드");
    }
    static void bcd(){
        System.out.println("static 메서드");
    }
}
public class StaticMethod {
    public static void main(String[] args) {

        //None static
        A3 a1 = new A3();
        a1.abc();

        //static
        A3.bcd();

    }
}
