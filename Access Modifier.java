Access Modifier:


private:

class Abc1{
    private int a;
    private int b;
    public void set(int a,int b) {
        this.a = a;
        this.b = b;
    }
        void print(){
            System.out.println(this.a+this.b);
        }
}

public class Private {
    public static void main(String[] args) {
        Abc1 a1=new Abc1();
        a1.set(10,20);
        a1.print();
    }
}


Public:

class Abc2{
    public int a;
    public int b;

    void print(){
        System.out.println(this.a+this.b);
    }
}

public class Public {
    public static void main(String[] args) {
        Abc2 a1=new Abc2();
        a1.a=10;
        a1.b=20;
        a1.print();
    }
}

