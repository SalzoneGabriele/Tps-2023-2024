package Produttoreconsumatore;

import javax.swing.plaf.ButtonUI;

public class risorsacondivisa {
    private int value;
    private int numItems = 0;
    static final int BUFFERSIZE = 4;

    public  synchronized void setValue(int v) throws InterruptedException{
        if (numItems== BUFFERSIZE) {
            wait();

        }
        System.out.println(" in ");
        value = v;
        numItems++;

        notify();

    }

    public synchronized int getValue() throws InterruptedException {
        if(numItems==0){
            wait();
        }
        System.out.println(" out ");
            numItems--;
        notify();
        return value;
    }
}
