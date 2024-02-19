import java.util.*;
class Person
  {
      String name;
      int age;
    Person(String name,int age)
    {
      this.name=name;
      this.age=age;
    }
    void print()
    {
      System.out.println("Name "+this.name+" with age "+this.age);
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      Person p[]=new Person[n];
      for(int i=0;i<n;i++)
        {
          String name=sc.next();
          int age=sc.nextInt();
          p[i]=new Person(name,age);
          p[i].print();
        }
    }
  }