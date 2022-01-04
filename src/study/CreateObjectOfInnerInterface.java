package study;

class A_InnerInterface{
    static interface B_InnerInterface{
        public abstract void bcd();
    }
}

class C_InnerInterface implements A_InnerInterface.B_InnerInterface{
    public void bcd(){
        System.out.println("이너 인터페이스 구현 클래스 생성");
    }
}

public class CreateObjectOfInnerInterface {
    public static void main(String[] args) {
        A_InnerInterface.B_InnerInterface ab = new C_InnerInterface();
        C_InnerInterface c = new C_InnerInterface();
        c.bcd();
        //
        A_InnerInterface.B_InnerInterface b = new A_InnerInterface.B_InnerInterface() {
            @Override
            public void bcd() {
                System.out.println("익명 이너 클래스로 객체 생성");
            }
        };
        b.bcd();
    }
}
