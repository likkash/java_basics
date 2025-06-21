//Functions and Parameters
package function;

public class Store {
    void soap(int money)
    {
        System.out.println(money);
        System.out.println("here is your soap");
    }
    void chocolate(int money)
    {
        System.out.println(money);
        System.out.println("here is your chocolate");
    }


    public static void main(String[] args) {
        Store obj = new Store();
        obj.soap(20);
        obj.chocolate(50);
    }
}
