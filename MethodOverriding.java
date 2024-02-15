class Parent
{
    void function1(int a)
    {
        System.out.println("Hello"+a);
    }
}
class Child extends Parent
{
    void function1(int a)
    {
        System.out.println("Hi"+a);
    }
}
public class Main{
    public static void main (String[] args) {
        Child obj=new Child();
        obj.function1(10);
}
}

//Output:Hi10
