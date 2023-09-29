package RestaurantDemo;

public class Order_Spaghetti extends Order {
    public Order_Spaghetti(Chef chef) {
        super(chef);
    }

    @Override
    public void execute() {
        ((Chef_Italian) chef).make_Spaghetti();
    }
}
