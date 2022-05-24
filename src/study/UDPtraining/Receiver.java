package study.UDPtraining;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Reciver {
    public static void main(String[] args) throws Exception {

        DatagramSocket datagramSocket = new DatagramSocket();

        Thread tread = new Thread();

        @Override
        public void run(){
            System.out.println("start Receiving");
            try{

            }catch (Exception e){
                System.out.println("Connection Closed");
            }
        }

    }
}
