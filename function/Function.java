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
//In java ,the 'return' keyword is used to exit a method and optionally return a value back to the caller of the method 

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
        System.out.println("The sum of 20 and 30 is "+ addition);
    }

//...................................................................................


//Create a function called getname(), which should return your name.
//Create a function called getphone(),which should return you the phone number.

    String getname()
    {
        return "Likkash";    
    }
    int getphone()
    {
        return 1234567890;
    }
    public static void main(String[] args) {
        Function obj = new Function();
        String Name = obj.getname();
        int phone = obj.getphone();
        System.out.println("Your name is "+Name);
        System.out.println("Your phone number is "+phone);
    }


//...................................................................................

//Coding challenge:

//Q1
//Create a class called 'Find' with main function.
//Create a function called evenorodd with integer parameter called int num.
//Inside Main function get integer input from user.
//Pass that input to the evenodd function and let the function decide whether the number is even or odd.

    void evenorodd(int num)
    {
        if(num%2==0){
            System.out.println("It is even number");
        } else {
            System.out.println("It is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find it is even or odd : ");
        int number = scan.nextInt();
        Function obj = new Function();
        obj.evenorodd(number);
    
    }


//...................................................................................


//Q2
//Create a class called "School" with main function.
//Create a function called passorfail which should return the string "Pass/Fail".
//Inside Main function get integer input from user for total mark.
//Pass that input to the passorfail function and let the function decide whether student is pass or fail.

    String passorfail(int mark) {
        if(mark > 35){
            return "pass";
        } else {
            return "fail";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total marks");
        int total_mark  = scan.nextInt();
        Function obj = new Function();
        String Result = obj.passorfail(total_mark);
        System.out.println(Result);
    }

//...................................................................................


//Method Overloading
//we can use Same function name ,but parameter must be different
// We can say this as method overloading and Function overloading

//Eg 1

    void display() {
        System.out.println("One");
    }
    void display(int a) {
        System.out.println("Two");
    }
    void display(int a , int b) {
        System.out.println("Three");
    }
    public static void main(String[] args) {
        Function obj = new Function();
        obj.display();
        obj.display(1);
        obj.display(1,2);
    }

//...................................................................................

//Eg 2

    void sum(int a,int b) {
        System.out.println(a+b);
    }
    void sum(int a , int b,int c) {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Function obj = new Function();
        obj.sum(10,12);
        obj.sum(10,12,13);
    }

//...................................................................................

//Enhanced For loop(For Each Loop)
//The Enhanced for loop in java,also known as the "for=each" loop,simplifies iterating over arrays and collections by automatically handling the iteration process without needing explicit index control,offering cleaner syntax and reducing potentianl errors.
//It is highly used when we are printing array 

//Eg 1:
    public static void main(String[] args) {
    
        int num[]= {10,20,30,40,50};

        //Normal for loop method
        for(int i=0;i<5;i++)
        {
            System.out.println(num[i]);
        }

        //Enhanced For Loop
        for(int var:num){
            System.out.println(var);
        }
    }

//...................................................................................

//Eg 2:
    public static void main(String[] args) {
        String dum[] = {"one","two","three"};
        for(String var:dum){
            System.out.println(var);
        }
    }

//...................................................................................

//End in VS code......
//Next in Eclipse..
}