package Semaphore;

public class SharedSource {
    private long counter;

    public void add(long value){
        counter+=value;
    }
    public void Subtract(long value){
        counter-=value;
    }
    public  long GetCounterValue(){
        return counter;
    }
}
