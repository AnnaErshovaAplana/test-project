public class Cake extends Present {
    private boolean isGlutenFree;

    public Cake(String name, int weight, double price, boolean isGlutenFree) {
        super(name, weight, price);
        this.isGlutenFree = isGlutenFree;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    @Override
    public String toString() {
        return "Cake: " + super.toString() + ", gluten free: " + isGlutenFree;
    }
}
