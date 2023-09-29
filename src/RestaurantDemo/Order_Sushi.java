package RestaurantDemo;

public class Order_Sushi extends Order {

    public Order_Sushi(Chef chef) {
        super(chef);
    }

    @Override
    public void execute() {
        ((Chef_Japanese) chef).make_sushi();
    }
}
