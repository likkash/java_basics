package function;

public class Addition {
    int a = 10;
    int b = 20;
    void sum()
    {
        System.out.println("The sum of a + b = " + (a+b));
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum();
    }
    
}
