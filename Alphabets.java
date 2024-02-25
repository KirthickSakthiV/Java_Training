import java.util.*;
class Alphabets
  {
    public String alph(String s)
    {
      for(int i=0;i<s.length();i++)
        {
          char c=s.charAt(i);
          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return "vowel";
          else
            return "consonant";
        }
      return null;

    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      String k=d.next();
      Alphabets a=new Alphabets();
      String h=a.alph(k);
     
      System.out.println(k+" :"+h);
    }
  }
