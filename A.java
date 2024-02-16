import java.util.Scanner;

class A
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    float a,b,c,r;
    a=sc.nextFloat();
    b=sc.nextFloat();
    c=a/b;
    r=a%b;
    System.out.println(c);
    System.out.println(r);
  }
}
