package RestaurantDemo;

public class Order_Sashimi extends Order{
    public Order_Sashimi(Chef chef) {
        super(chef);
    }

    @Override
    public void execute() {
        ((Chef_Japanese) chef).make_sashimi();
    }
}
