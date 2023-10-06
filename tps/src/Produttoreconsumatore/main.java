package Produttoreconsumatore;

import Semaphore.SharedSource;

public class main {
    public static void main(String[] args)throws InterruptedException {
        risorsacondivisa resource=new risorsacondivisa();
        produttore p=new produttore(resource);
        consumatore c=new consumatore(resource);
        p.start();c.start();

    }
}
