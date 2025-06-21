package function;

import java.util.Scanner; 

public class Function {

//Basic Demo for function

//normal - without static it cannot access directly. so we are creating object to access it
    // void greet()
    // {
    //     System.out.println("vanakam");
    //     dummy();
    // }
    // void dummy()
    // {
    //     System.out.println("Dummy");
    // }
    // public static void main(String[] args) {
    //     Function obj1 = new Function();
    //     obj1.greet();

    // }

//...................................................................................

//static - by including static to other function we can access itdirectly
    // static void greet()
    // {
    //     System.out.println("vanakam");
    //     dummy();
    // }
    // static void dummy()
    // {
    //     System.out.println("Dummy");
    // }
    // public static void main(String[] args) {
    //     greet();
    // }


//.................................................................................

//Eg for Garden
    // int apple_price = 20;
    // int apple_count = 5;

    // void total_money()
    // {
    //     System.out.println(apple_price*apple_count);
    // }
    // public static void main(String[] args) {
    //     Function obj = new Function();
    //     obj.total_money();
    // }

//..................................................................................

//Eg for mobile

//  void iphone()
//     {
//         System.out.println("Iphone");
//     }

//     void samsung()
//     {
//         System.out.println("Samsung");
//     }
//     public static void main(String[] args) {
//         Function obj = new Function();
//         obj.iphone();
//         obj.samsung();
//     }

//...................................................................................

//Eg fo addition

    // int a = 10;
    // int b = 20;
    // void sum()
    // {
    //     System.out.println("The sum of a + b = " + (a+b));
    // }

    // public static void main(String[] args) {
    //     Function obj = new Function();
    //     obj.sum();
    // }

//...................................................................................



//Functions and parameters :

//You can give parameters inside the function brackets

//Eg 1
//For shop:
    //  void soap(int money)
    // {
    //     System.out.println(money);
    //     System.out.println("here is your soap");
    // }
    // void chocolate(int money)
    // {
    //     System.out.println(money);
    //     System.out.println("here is your chocolate");
    // }


    // public static void main(String[] args) {
    //     Function obj = new Function();
    //     obj.soap(20);
    //     obj.chocolate(50);
    // }

//...................................................................................

//Eg 2
//Adding 2 numbers :
    // void sum(int a ,int b)
    // {
    //     System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
    // }
    // void multiple(int a , int b)
    // {
    //     System.out.println("The multiplication of "+a+" and "+b+ " is "+ (a*b));
    // }
    // public static void main(String[] args){
    //     Function obj = new Function();
    //     obj.sum(10,20);
    //     obj.multiple(5,10);
    // }

//...................................................................................

//Eg 3 
//Adding 2 numbers through command line:
    // void sum(int a ,int b)
    // {
    //     System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
    // }
    // void multiple(int a , int b)
    // {
    //     System.out.println("The multiplication of "+a+" and "+b+ " is "+ (a*b));
    // }
    // public static void main(String[] args){
    //     Scanner scan=new Scanner(System.in);
    //     Function obj = new Function();
    //     System.out.println("Enter 2 number for addition");
    //     int a = scan.nextInt();
    //     int b = scan.nextInt();
    //     System.out.println("Enter 2 number for Multiplication");
    //     int c = scan.nextInt();
    //     int d = scan.nextInt();
    //     obj.sum(a,b);
    //     obj.multiple(c,d);
    // }

//...................................................................................



//Return Keyword:
//In java ,the 'return' keyword is used to exir a method and optionally return a value back to the caller of the method 

//Eg 1
//shop:
int soap(int money)
{
   int soap_price = 18;
   int rem = money - soap_price;
   return rem;  
}

public static void main(String[] args) {
    Function amount = new Function();
    int remainder = amount.soap(20);
    System.out.println("The remaining amount is "+ remainder);

}

//...................................................................................

//Eg 2
//additon of 2 numbers:

    int sum(int a , int b){
        // int add = a+b;
        return a+b;
    }
    public static void main(String[] args) {
    Function obj = new Function();
    int addition = obj.sum(20,30);
    System.out.println("The addition of 20 and 30 is "+ addition);
}

//...................................................................................


}