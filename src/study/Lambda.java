package study;

interface A_lambda{
    void abc();
}
class B {
    void bcd(){
        System.out.println("메서드");
    }
}
public class Lambda {
    public static void main(String[] args) {
        A_lambda a1 = new A_lambda() {
            @Override
            public void abc() {
                B b = new B();
                b.bcd();

            }
        };

        A_lambda a2 = () ->{
            B b=  new B();
            b.bcd();
        };
    }
}
