package RestaurantDemoSimplified;

import java.util.ArrayList;
import java.util.List;

// Command interface
interface Command {
    void execute();
}

// Concrete command class
class OrderCommand implements Command {
    private Chef chef;
    private String dish;

    public OrderCommand(Chef chef, String dish) {
        this.chef = chef;
        this.dish = dish;
    }

    @Override
    public void execute() {
        chef.prepareDish(dish);
    }
}

// Receiver class
class Chef {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public void prepareDish(String dish) {
        System.out.println(name + " is preparing " + dish);
    }
}

// Invoker class
class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void takeOrder(Command command) {
        orders.add(command);
    }

    public void placeOrders() {
        for (Command command : orders) {
            command.execute();
        }
        orders.clear();
    }
}

// Client class
public class RestaurantDemoSimplified {
    public static void main(String[] args) {
        Chef italianChef = new Chef("Italian Chef");
        Chef sushiChef = new Chef("Sushi Chef");

        Waiter waiter = new Waiter();

        // Customers place orders through the waiter
        waiter.takeOrder(new OrderCommand(italianChef, "Spaghetti Carbonara"));
        waiter.takeOrder(new OrderCommand(sushiChef, "California Roll"));
        waiter.takeOrder(new OrderCommand(italianChef, "Margherita Pizza"));

        // Waiter places the orders with the chefs
        waiter.placeOrders();
    }
}
