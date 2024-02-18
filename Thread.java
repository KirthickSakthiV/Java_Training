                                                                   Thread

class Printer {
    void printDoc(int page, String s) {
        for (int i = 1; i <= page; i++) {
        System.out.println("printing " +i+ " page for " +s);
    }
}
}
    class MathThread extends Thread{
    Printer p;
    MathThread(Printer p){
        this.p=p;
    }
    public void run(){
        this.p.printDoc(5,"Maths");
    }
    }
    class ScienceThread extends Thread{
    Printer p;
    ScienceThread(Printer p){
        this.p=p;
    }
    public void run(){
        this.p.printDoc(7,"Science");
    }
    }
    public class Ks{
    public static void main(String[] args){
        Printer p1=new Printer();
        MathThread m1=new MathThread(p1);
        ScienceThread s1=new ScienceThread(p1);
        m1.start();
        try{
            m1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        s1.start();
    }
    }