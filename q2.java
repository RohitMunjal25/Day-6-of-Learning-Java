class table2 extends Thread{
    int i;
    public void run(){
        for(int i=1;i<=10;i++){
        System.out.println("2 x"+i+"="+(2*i));
        try{
            Thread.sleep(100);
        } catch(InterruptedException e){
            e.printStackTrace();
        }}
    }

}
class table3 implements Runnable{
    int i;
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("3 x"+i+"="+(3*i));
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        } 
    

    }
 
}
public class q2{
    public static void main(String[] args) {
        table2 obj1=new table2();
        table3 obj2=new table3();
        Thread th2=new Thread(obj2);
        obj1.start();
        th2.start();
    }
}