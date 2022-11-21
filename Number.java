import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("enter your choice");
        System.out.println("1. largest of three numbers 2.smallest of three numbers 3.prime number 4.even or odd 5.reverse of number");
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

       switch(n)
       {
           case 1:
               System.out.println("enter three numbers:");
               int a = sc.nextInt();
               int b= sc.nextInt();
               int c= sc.nextInt();
               if (a>b && a>c)
               {
                   System.out.println("a is the largest");
               }
               else if (b>a && b>c) {
                   System.out.println("b is the largest");
               }
               else {
                   System.out.println("c is the largest");
               }

       }
    }
}
