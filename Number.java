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
                   System.out.println(a+" is the largest");
               }
               else if (b>a && b>c) {
                   System.out.println(b+" is the largest");
               }
               else {
                   System.out.println(c+" is the largest");
               }
               break;
           case 2:
               System.out.println("enter three no");
               int a1 = sc.nextInt();
               int b1= sc.nextInt();
               int c1= sc.nextInt();
               if (a1<b1 && a1<c1)
               {
                   System.out.println(a1+" is the smallest");
               }
               else if (b1<a1 && b1<c1) {
                   System.out.println(b1+" is the smallest");
               }
               else {
                   System.out.println(c1+" is the smallest");
               }
               break;
           case 3:
               System.out.println("enter the number you want to check prime or not");
               int a3 = sc.nextInt();
               boolean flag = false;
               for (int i = 2; i <= a3 / 2; ++i) {
                   // condition for nonprime number
                   if (a3 % i == 0) {
                       flag = true;
                       break;
                   }
               }

               if (!flag)
                   System.out.println(a3 + " is a prime number.");
               else
                   System.out.println(a3 + " is not a prime number.");

           case 4:
               System.out.println("enter the number you want to check even or odd");
               int a4= sc.nextInt();
               if(a4%2 ==0)
               {
                   System.out.println(a4+"is even");
               }
               else{
                   System.out.println(a4+"is odd");
               }

       }



       }

    }

