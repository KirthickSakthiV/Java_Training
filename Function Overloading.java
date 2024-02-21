import java.util.*;
class Over
  {
    int a,b,c;
    public void fun1(int a,int b,int c)
    {
      int x=a*b*c;
      System.out.println(x);
    }
    public void fun1(int a,int b){
      int y=a+b;
      System.out.println(y);
    }
  }
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Over o=new Over();
    if(n==3)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      o.fun1(a,b,c);
    }
    else{
        int a=sc.nextInt();
        int b=sc.nextInt();
      o.fun1(a,b);
    }
    }
  }
