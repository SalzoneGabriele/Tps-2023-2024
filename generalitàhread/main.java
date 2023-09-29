package generalitàhread;

public class main {
    public static void main(String[] args) {
        new main().Exec();
    }
    public void Exec(){
        Thread t =Thread.currentThread();
        System.out.println("print standard");
        System.out.println(t);
        try{
            t.setPriority(11);

        }catch (IllegalArgumentException e){
            t.setPriority(Thread.NORM_PRIORITY);

        }

        t.interrupt();
        t.setName("cambio nome");
        System.out.println(t);

        System.out.println(t.getState());
    }
}
