package function;

import java.util.Scanner;

public class Sample{
    void sum(int a ,int b)
    {
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
    }
    void multiple(int a , int b)
    {
        System.out.println("The multiplication of "+a+" and "+b+ " is "+ (a*b));
    }
    public static void main(String[] args){
        Sample obj = new Sample();
        obj.sum(10,20);
        obj.multiple(5,10);
    }
}

// public class Sample{
//     void sum(int a ,int b)
//     {
//         System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
//     }
//     void multiple(int a , int b)
//     {
//         System.out.println("The multiplication of "+a+" and "+b+ " is "+ (a*b));
//     }
//     public static void main(String[] args){
//         Scanner scan=new Scanner(System.in);
//         Sample obj = new Sample();
//         System.out.println("Enter 2 number for addition");
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         System.out.println("Enter 2 number for Multiplication");
//         int c = scan.nextInt();
//         int d = scan.nextInt();
//         obj.sum(a,b);
//         obj.multiple(c,d);
//     }
// }