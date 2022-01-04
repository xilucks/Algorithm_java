package study;

interface A_Anonymous_3{
    public abstract void abc();
}
class B_Anonymous_3 implements A_Anonymous_3{
    public void abc(){
        System.out.println("입력매개변수 전달");
    }
}
class C_Anonymous_3{
    void cde(A_Anonymous_3 a){
        a.abc();
    }
}
public class AnonymousClass_3 {
    public static void main(String[] args) {
        C_Anonymous_3 c  = new C_Anonymous_3();

        A_Anonymous_3 a = new B_Anonymous_3();
        c.cde(a);

        c.cde(new B_Anonymous_3());

        c.cde(new A_Anonymous_3() {
            @Override
            public void abc() {
                System.out.println("입력매개변수 전달");
            }
        });
    }
}
