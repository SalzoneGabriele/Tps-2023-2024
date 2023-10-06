package Semaphore;

import java.beans.beancontext.BeanContextChild;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class main extends Thread{
    public static void main(String[] args) throws InterruptedException {
        SharedSource resource=new SharedSource();
        ArrayList<Thread> threads =new ArrayList<>();
        for(int i=0;i<3;i++){
            threads.add(new AdderThread("AdderThread"+(i+1),resource));
        }
        for(Thread t:threads)t.start();
        for (Thread t: threads)t.join();
        System.out.println("Valore in risorsa:"+ resource.GetCounterValue());
    }

}
