package Produttoreconsumatore;

public class consumatore extends Thread {
    private risorsacondivisa resource;

    public consumatore(risorsacondivisa resource){
        this.resource=resource;
    }

    @Override
    public void run(){
        for (int i=0;i<10;i++){
            try {
                int resVal= resource.getValue();
                System.out.println(" C"+resVal);
            }catch (InterruptedException e){
                System.out.println(getName()+" interrotto.");
                break;
            }

        }
    }
}
