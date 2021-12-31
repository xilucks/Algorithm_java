package Tutoring.BusinessProgramming;

public class Goods {
    public static void main(String[] args) {
        Good camera = new Good();
        camera.name = "Nikon";
        camera.price = 400000;
        camera.numOfStock = 30;
        camera.sold = 50;

    }
    public static class Good{
        String name;
        int price;
        int numOfStock;
        int sold;

    }
    public static class MyExp{
        public static void main(String[] args) {
            getValue(2,3);
            getValue(3,4);
        }
        static int getValue(int exp, int base){
            int total = 1; //0으로 1*(2^3)
            for(int i = 0; i<exp;i++){
                total *= base;
            }
            return total;
        }
    }
}


