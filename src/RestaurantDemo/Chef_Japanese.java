package RestaurantDemo;

public class Chef_Japanese extends Chef {
    public Chef_Japanese(String name) {
        super(name);
    }

    public void make_sushi() {
        System.out.println("Japanese chef, " + getName() + ", is preparing Sushi");
    }

    public void make_sashimi() {
        System.out.println("Japanese chef, " + getName() + ", is preparing Sashimi");
    }
}
