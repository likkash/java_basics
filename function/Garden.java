package function;

public class Garden {
    int apple_price = 20;
    int apple_count = 5;

    void total_money()
    {
        System.out.println(apple_price*apple_count);
    }
    public static void main(String[] args) {
        Garden obj = new Garden();
        obj.total_money();
    }
}
