class eventhread extends Thread{
    public void run(){
        for (int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println("even are:"+i);
                try{
                    Thread.sleep(4);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
class oddthread extends Thread {
    public void run(){
        for(int i=0;i<=10;i++){
            if(i%2!=0){
                System.out.println("odd are:"+i);
                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
            }
        }
    }
}
public class q1{
    public static void main(String[] args)  {
        eventhread ev1=new eventhread();
        oddthread od1=new oddthread();
        ev1.start();
        od1.start();
    }
}