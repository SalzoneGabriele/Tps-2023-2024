package LavorareCoiDaemon;

public class IlMioDaemon extends Thread{
    public IlMioDaemon (String name){
        super(name);
        setDaemon(true);
    }
    @Override
    public  void run(){
        int index=0;
        for(int i=0;i<1000;i++){
            System.out.println(getName()+": "+index++);
            try{
                Thread.sleep(001);

            }catch(InterruptedException e){
break;

            }
        }

    }
}
