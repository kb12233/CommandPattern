package RestaurantDemo;

//Abstract Command class
public abstract class Order {
    Chef chef;

    public Order(Chef chef) {
        this.chef = chef;
    }

    public abstract void execute();
}

