1.Static Polymorphism:

class abc1 {
    void f1(int n) {
        System.out.println(n);
    }

    void f1(int a, int b) {
        System.out.println(a + b);
    }
}
    class abc{
        public static void main(String[] args) {
            abc1 a1 = new abc1();
            a1.f1(5);
            a1.f1(5, 10);
        }
    }

2.Dynamic Polymorphism:

class Parent1 {
    void f1(int n) {
        System.out.println("Hi" + n);
    }
}
    class child extends Parent1
    {
        void f1(int n)
        {
            System.out.println("Hello"+n);
        }
    }
    class Parent
    {
        public static void main(String args[])
        {
            child c1=new child();
            c1.f1(5);
        }
    }

