package study;

public class FlexibleSizeArrayArgument {
    public static void main(String[] args) {
        method1(1, 2);
        method1(1, 2, 3);
        method1();

        method2("안녕", "자바");
        method2("파이썬", "C++", "루비");
        method2();
    }

    public static void method1(int... values) {
        System.out.println(values.length);

        for(int k: values){
            System.out.println(k+" ");
        }
    }

    public static void method2(String ...values){
        System.out.println(values.length);

        for(String k: values){
            System.out.println(k+" ");
        }
    }
}

