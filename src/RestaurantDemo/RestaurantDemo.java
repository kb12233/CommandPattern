package RestaurantDemo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RestaurantDemo {
    public static void main(String[] args) {
        Chef_Italian italianChef = new Chef_Italian("Alberto");
        Chef_Japanese sushiChef = new Chef_Japanese("Naruto");

        Waiter waiter = new Waiter();

        // Customers place orders through the waiter
        waiter.takeOrder(new Order_SpaghettiCarbonara(italianChef));
        waiter.takeOrder(new Order_Spaghetti(italianChef));
        waiter.takeOrder(new Order_Sushi(sushiChef));
        waiter.takeOrder(new Order_Sashimi(sushiChef));

        // RestaurantDemo.Waiter places the orders with the chefs
        waiter.placeOrders();
    }
}