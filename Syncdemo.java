class counter extends Thread{
    private int count=0;
    public void increment(){
        count++;

    }
    public int getcount(){
        return count;
    
           
    }
}

public class Syncdemo{
    public static void main(String[] args) {
        counter obj=new counter();
        Thread t1=new Thread();
        for(int c=0;c<1000;c++){
            obj.increment();
        }
        
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("final count is:"+obj.getcount());
    
    }
    

}