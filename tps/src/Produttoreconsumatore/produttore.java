package Produttoreconsumatore;

public class produttore extends Thread{
    private risorsacondivisa resource;
    public produttore (risorsacondivisa resource){
        this.resource=resource;
    }
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            try {
                int v= (int)(Math.random()*100)+1;
                resource.setValue(v);
                System.out.println(" P"+v);
            }catch (InterruptedException e) {
                System.out.println(getName()+"interrotto.");
                break;
            }


        }}
    }

