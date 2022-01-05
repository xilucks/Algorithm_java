package study;

class MinusException extends Exception {
    public MinusException(){
        super();
    }
    public MinusException(String message){
        super(message);
    }
}

class OverException extends Exception {
    public OverException(){
        super();
    }
    public OverException(String message){
        super(message);
    }
}

class A_Exception{
    void checkScore(int score) throws MinusException, OverException{
        if(score < 0){
            throw new MinusException("음수값");
        }
        else if (score > 100){
            throw new OverException("초과값");
        }
        else {
            System.out.println("정상값");
        }
    }
}

public class UserExceptionExample {
    public static void main(String[] args) {
        A_Exception a = new A_Exception();

        try{
            a.checkScore(85);
            a.checkScore(101);
        } catch (MinusException | OverException e) {
            System.out.println(e.getMessage());
        }
    }
}
