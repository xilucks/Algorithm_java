package study;

interface A_interface_2{
    int a = 3;
    void abc();
}
public class CreateObjectOfInterface_2 {
    public static void main(String[] args) {

        A_interface_2 a1 = new A_interface_2() {
            @Override
            public void abc() {

            }
        };
    }
}
