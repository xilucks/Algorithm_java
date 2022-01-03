package study;

class A_AccessMember{
    public int a = 3;
    protected int b  = 4;
    int c = 5;
    private int d = 6;
    void abc(){
        System.out.println("A 클래스 메서드 abc()");
    }

    class B_AccessMember{
        void bcd(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            abc();
        }
    }
}

public class CreateObjectAndAccessMember {
    public static void main(String[] args) {
        A_AccessMember a = new A_AccessMember();

        A_AccessMember.B_AccessMember b = a.new B_AccessMember();
        b.bcd();
    }
}
