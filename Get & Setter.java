                                                             Getter & Setter

class Abc3{
    private int age;
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }
}

public class settergetter {
    public static void main(String[] args) {
        Abc3 a1=new Abc3();
        a1.setAge(30);
        int b= a1.getAge();
        System.out.print("Hello"+b);
    }
}