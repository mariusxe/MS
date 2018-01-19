package mypackage;

import org.apache.commons.codec.digest.DigestUtils;


public class MyThread  implements Runnable {

    private int start;
    private int stop;

    MyThread(){}

    MyThread(int start, int stop){
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {

       for(int i=start; i<stop && !Main.status; i++){
           String s = String.valueOf(i);
           String sha256hex = DigestUtils.sha256Hex(s);

           if(sha256hex.equalsIgnoreCase("0BF5A213DC4C37565FBC5CB30AF010297B60DAAD4D21DE94CA3650A9D4E5332F")){
               System.out.println("Nume thread: " + Thread.currentThread().getName());
               System.out.println("Parola cautata corespunde numarului: " + i);
               Main.status = true;
           }
       }
    }
}
