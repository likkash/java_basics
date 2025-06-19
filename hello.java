import java.util.Scanner;
class hello{
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, score for 100 marks and department");
        String name = sc.nextLine();
        double score = sc.nextDouble();
        sc.nextLine(); // Consume the newline character left by nextInt()
        String department = sc.nextLine();
        System.out.println("Hello " + name + " you are " + score/10 + " your dept " + department);
    }
}