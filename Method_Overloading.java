class MethodOverloading
{
    void function1(int a)
    {
        System.out.println(a);
    }
    void function1(int a,int b)
    {
        System.out.println(a+b);
    }
}
public class Main{
    public static void main (String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.function1(10);
        obj.function1(10+20);
}
}
