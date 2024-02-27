import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,p,ele,i;
      n=d.nextInt();
      int a[]=new int[n+1];
      for(i=0;i<n;i++)
        a[i]=d.nextInt();
      p=d.nextInt();
      ele=d.nextInt();
      p--;
      for(i=n;i>=p;i--)
        a[i]=a[i-1];
      a[p]=ele;
      n+=1;
      for(i=0;i<n;i++)
        System.out.print(a[i]+"\n\n");
    }
  }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             