package study;

class SMIFileThread extends Thread {
    @Override
    public void run(){
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        try {Thread.sleep(10);} catch (InterruptedException e) {}

        for(int i = 0; i <strArray.length; i++){
            System.out.println(strArray[i]);
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e ){}
        }
    }
}

public class CreateAndStartThread_M1C1 {
    public static void main(String[] args) {
        Thread smiFileTread = new SMIFileThread();
        smiFileTread.start();

        int[] intArray = {1, 2, 3, 4, 5};

        for(int i = 0; i< intArray.length; i++){
            System.out.println(intArray[i]);
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e ){}
        }
    }
}
