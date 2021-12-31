package Tutoring.BusinessProgramming;

class MyClass {
    int i;
}


public class Example {
    public static void main(String[] args) {
        MyClass[] a = new MyClass[10];

        for(int j = 0; j <a.length; j++){
            a[j] = new MyClass();
            a[j].i = j;

            };
        }

    }


