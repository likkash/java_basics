import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class basic {
    public static void main(String args[])
    {
        // String f1 = new String("apple");
        // String f2 = "apple";

        // System.out.println(f1 == f2);
        // System.out.println(f1.equals(f2));

//if
    //1
        // System.out.println("Your mark:");
        // Scanner scan = new Scanner(System.in);
        // int mark = scan.nextInt();

        // if(mark>=35)
        // {
        //     System.out.println("pass");
        // }
        // else{
        //     System.out.println("Fail");
        // }


    //2
        // System.out.println("Your income for Scholarship:");
        // Scanner scan = new Scanner(System.in);
        // int income = scan.nextInt();
        // if(income>=7000)
        // {
        //     System.out.println("Scholarship available");
        // }
        // else
        // {
        //     System.out.println("Not eligible for scholarship");
        // }


    // 3
        // System.out.println("Enter a number for division by 3 and 5 : ");
        // Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        // // int num1 = num%3;
        // // int num2 = num%5;
        // if(num%3 ==0 && num%5==0)
        // {
        //     System.out.println("It is divisible by both 3 and 5");
        // }
        // else{
        //     System.out.println("It is not divisible by both 3 and 5");

        // }


    //4
        // System.out.println("Enter a number : ");
        // Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        // if(num%2 == 0)
        // {
        //     System.out.println(num +" is even number");
        // }
        // else 
        // {
        //     System.out.println(num +" is odd number");
        // }


//ielse if
        // System.out.println("Enter your marks : ");
        // Scanner scan = new Scanner(System.in);
        // int mark = scan.nextInt();
        // if(mark>=90)
        // {
        //     System.out.println("you secured a A Grade");
        // }
        // else if(mark>=80 && mark<=89)
        // {
        //     System.out.println("you secured a B Grade");
        // }
        // else if(mark>=50 && mark<=79)
        // {
        //     System.out.println("you secured a C Grade");
        // }
        // else
        // {
        //     System.out.println("you failed in this exam");
        // }


//Nested if
    //1
        // System.out.println("Enter whic shop you want to go : ");
        // Scanner scan = new Scanner(System.in);
        // String shop = scan.nextLine();
        // if(shop.equals("KFC"))
        // {
        //     System.out.println("you entered " + shop);
        //     System.out.println("place your order :");
        //     String order = scan.nextLine();
        //     if(order.equals("chicken"))
        //     {
        //         System.out.println("you ordered " + order);
        //     }
        // }
        // else
        // {
        //     System.out.println("you didn't wnat to goo!!");
        // }


        // System.out.println("Enter your 5 subject marks : ");
        // Scanner scan = new Scanner(System.in);
        // int m1 = scan.nextInt();
        // int m2 = scan.nextInt();
        // int m3 = scan.nextInt();
        // int m4 = scan.nextInt();
        // int m5 = scan.nextInt();
        // int total = m1 + m2 + m3 + m4 + m5;
        // int average = total / 5;

        // if(average < 35)
        // {
        //     System.out.println(average +" Additional class is required");
        // }
        // else 
        // {
        //     System.out.println(average +" you are good to go");
        // }


//Ternary operator
        // System.out.println("Enter 2 numbers : ");
        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // int b = scan.nextInt();
        // String result = a>b?"a is greater than b":"b is greater than a";
        // System.out.println(result);


//For loop
    //1
        // for(int i= 10;i>=1;i--)
        // {
        //     System.out.println(i);
        // }

        // for(int i= 5;i<=10;i++)
        // {
        //     System.out.println(i);
        // }
        
    //2
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // int a = scan.nextInt();
        // System.out.println("Enter number 2");
        // int b = scan.nextInt();

        // for( int i = a; i<=b;i++)
        // {
        //     System.out.println(i);
        // }


//for loop and if else sums
    //1
        // for(int i=1;i<=10;i++)
        // {
        //     if(i%2==0)
        //     {
        //         System.out.println(i);
        //     }
        // }
        
    //2    
        // int oddc = 0;
        // int evenc = 0;
        // for(int i=1;i<=51;i++)
        // {
        //     if(i%2==0)
        //     {
        //         // System.out.println(i);
        //         evenc = evenc+1;
        //     }
        //     else
        //     {
        //         // System.out.println("odd number : "+ i);
        //         oddc = oddc + 1;
        //     }
        // }
        // System.out.println("count of odd numbers :" + evenc);
        // System.out.println("count of odd numbers :" + oddc);

    //3
    //     for(int i = 1; i<=100;i++)
    //     {
    //         if(i%3==0 && i%5==0)
    //         {
    //             System.out.println("The number which are divisible by 3 and 5 are "+i);
    //         }
    //     }


//Array
    //1 
        // String[] playlist = new String[4];
        // playlist[0] = "song1";
        // playlist[1] = "song2";
        // playlist[2] = "song3";
        // System.out.println(playlist[0]);     
        // System.out.println(playlist[1]);     
        // System.out.println(playlist[2]);     
        // System.out.println(playlist[3]);


    //2
        // String[] playlist = {"song1","song2","song3"};
        // System.out.println(playlist[2]);


    //3
        // int[] marks = new int[5];
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter 5 subject marks : ");
        // marks[0] = scan.nextInt();
        // marks[1] = scan.nextInt();
        // marks[2] = scan.nextInt();
        // marks[3] = scan.nextInt();
        // marks[4] = scan.nextInt();
        // System.out.println(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]);


//array and for loop
    //1
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter 5 subject marks : ");
        // int[] mark = new int[5];
        // for(int i=0;i<=4;i++)
        // {
        //     mark[i] = scan.nextInt();
        // }
        // for(int i=0;i<=4;i++)
        // {
        //     System.out.println("the marks for subject "+(i+1)+" is " +mark[i]);
        // }

    //2
        // Scanner scan = new Scanner(System.in);
        // int[] mark = new int[10];
        // System.out.println("Enter 10 numbers : ");
        // for(int i=0;i<=9;i++)
        // {
        //     mark[i] = scan.nextInt();
        // }
        // for(int i=0;i<=9;i++)
        // {
        //     System.out.println("the number "+(i+1)+" is " +mark[i]);
        // }

    //3
        // for(int i=1;i<=50;i++)
        // {
        //     System.out.println(i +" x 2 = "+(i*2));
            
        // }

    //4
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the numbers for table : ");
        // int i = scan.nextInt();
        // for(int j= 1 ; j<=10;j++)
        // {
        //     System.out.println(j+" x "+i+" = "+(j*i));
        // }


    //5
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the size");
        // int size = scan.nextInt();
        // int[] marks = new int[size];
        // System.out.println("Enter the numbers ");
        // for(int i=0;i<= size-1;i++)
        // {
        //     marks[i] = scan.nextInt();
        
        // }


//Nested Loop 
    //1
        // for(int teacher =1;teacher<=1;teacher++)
        // {
        //     for(int i=1;i<=5;i++)
        //     {
        //         System.out.println("LikkashAishwarya");
        //     }
        // }

    // //2 
    //     for(int i=1;i<=3;i++)
    //     {
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }


//while loop
    //1
        // int i =1;
        // while(i<=5)
        // {
        //             System.out.println(i);
        //             i++;

        // }

    //2
        // Random rand = new Random();
        // int num = 0;
        // while(num!=5)
        // {
        //     num = rand.nextInt(11);
        //     System.out.println(num);
        // }


//do-while
    //1
        // int count = 0;
        // do{
        //     System.out.println("john");
        //     count = count+1;
        // }while(count<0);

    //2
        // Scanner scan = new Scanner(System.in);
        // int a = 0;
        // do{
        // System.out.println("Enter the number > 10 : ");
        // int a = scan.nextInt();
        // }while(a<10);


//classes and objects
//functions
//Functions and parameters
//Return type
       
    }
}
