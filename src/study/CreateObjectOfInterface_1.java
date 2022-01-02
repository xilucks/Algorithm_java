package study;

interface A_interface{
    int a = 3;
    void abc();
}

class B_class implements A_interface{
    public void abc(){

    }
}
public class CreateObjectOfInterface_1 {
    public static void main(String[] args) {
        A_interface a1 = new B_class();
    }
}
