package RestaurantDemo;

public class Chef_Italian extends Chef {

    public Chef_Italian(String name) {
        super(name);
    }

    public void make_spaghettiCarbonara() {
        System.out.println("Italian chef, " + getName() + ", is preparing Spaghetti Carbonara");
    }

    public void make_Spaghetti() {
        System.out.println("Italian chef, " + getName() + ", is preparing Spaghetti");
    }
}
