package Tutoring.BusinessProgramming;

import java.util.Scanner;

public class Human {
    private String name;
    private int age;
    private double height;
    private int mathscore;


    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    double getHeight(){
        return this.height;
    }

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setHeight(double height){
        this.height = height;
    }

    Human(){

    }

    public void setMath(int score){
        this.mathscore = score;
    }

    Human(String name, int age , double height){
        setName(name);
        setAge(age);
        setHeight(height);
    }

    public void tostring(){
        System.out.println("이름: " + getName() );
        System.out.println("나이: " + getAge());
        System.out.println("키: " + getHeight());
    }

    public static void main(String[] args) {
        Human aHuman = new Human("정민호", 29, 180.5);
        aHuman.tostring();


        Scanner sc = new Scanner(System.in);
        System.out.println("학생수를 입력하세요");
        int num = sc.nextInt();
        Human[] bHuman = new Human[num];

        for(int i = 0 ; i<num; i++){
            System.out.println("이름을 입력하세요 " );
            String name = sc.next();
            System.out.println("나이를 입력하세요 " );
            int age = sc.nextInt();
            System.out.println("키를 입력하세요 " );
            double height = sc.nextDouble();
            bHuman[i] = new Human(name,age,height);
            System.out.println("수학점수를 입력하세요 " );
            int math = sc.nextInt();
            bHuman[i].setMath(math);
        }

        for(int i = 0 ; i<num;i++){
            bHuman[i].tostring();
        }
    }
}


