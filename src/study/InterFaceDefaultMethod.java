package study;

interface A_interface_3 {
    default void abc(){
        System.out.println("A 인터페이스의 abc()");
    }
}
class B_Class_3 implements A_interface_3 {
    @Override
    public void abc(){
        A_interface_3.super.abc();
        System.out.println("B 클래스의 abc()");
    }
}
public class InterFaceDefaultMethod {
}
