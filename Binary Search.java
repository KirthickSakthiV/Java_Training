BINARY SEARCH

import java.util.*;
class Main
  {
    static int binarysearch(int[] a,int low,int high,int s)
    {
      if(low<=high)
      {
        int mid=low+(high-low)/2;
      if(a[mid]==s)
        return mid;
      if(a[mid]>s)
        return binarysearch(a,low,mid-1,s);
      return binarysearch(a,mid+1,high,s);
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
      int s=d.nextInt();
      System.out.println(binarysearch(a,0,n,s));
    }
  }