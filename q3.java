class firstthread extends Thread{
    public void run(){
        System.out.println("printing character from A to E:");
        for(char c='A'; c<='E';c++){
            System.out.println(c);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }

        }
    }
}
class secondthread extends Thread{
    public void run(){
        System.out.println("printing character from F to J:");
        for(char c='F';c<='J';c++){
            System.out.println(c);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class q3{
    public static void main(String[] args) {
        firstthread obj1=new firstthread();
        secondthread obj2=new secondthread();
        obj1.start();
        obj2.start();
    }
}