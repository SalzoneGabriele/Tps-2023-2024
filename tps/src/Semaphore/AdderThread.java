package Semaphore;

import java.util.concurrent.Semaphore;

public class AdderThread extends Thread{
    private SharedSource resource;
    private static Semaphore sem=new Semaphore(1);

    public AdderThread(String name, SharedSource resource){
        super(name);
        this.resource=resource;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            try{
                sem.acquire();
            }catch (InterruptedException e){
                System.err.println(getName()+" Interrupted");
                break;
            }
            resource.add(1);
            sem.release();
        }
    }
}
