package Tutoring.BusinessProgramming;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, int age) {

    }
    public Dog(String name, String breed, int age){

    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "개의 이름:" +getName() + "종류:" + getBreed() + "나이:" +getAge();

    }

}
