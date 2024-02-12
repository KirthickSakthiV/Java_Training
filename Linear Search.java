LINEAR SEARCH

import java.util.*;
class Main
{
    static int linearsearch(int[] a,int n,int search)
    {
        for(int i=0;i<n;i++)
        {
            if(search==a[i])
            return i;
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=d.nextInt();
        int search=d.nextInt();
        int k=linearsearch(a,n-1,search);
        System.out.println(k);
        
    }
}
