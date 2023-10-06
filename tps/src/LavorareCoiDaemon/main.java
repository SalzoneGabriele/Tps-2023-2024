package LavorareCoiDaemon;

public class main {
    public static void main(String[] args) throws InterruptedException {
        IlMioDaemon dt1=new IlMioDaemon("Daemon 1");
        IlMioDaemon dt2=new IlMioDaemon("Daemon 2");
        dt1.start();
        dt2.start();
        dt1.join();
        dt2.join();
        for(int i=0;i<10;i++){
            System.out.println("main");
            Thread.sleep(500);
        }

    }


}
