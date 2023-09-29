package RestaurantDemo;

public class Order_SpaghettiCarbonara extends Order {

    public Order_SpaghettiCarbonara(Chef chef) {
        super(chef);
    }

    @Override
    public void execute() {
        ((Chef_Italian) chef).make_spaghettiCarbonara();
    }
}
