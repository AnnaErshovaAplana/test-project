public class Chocolate extends Present {
    private boolean nutsInside;

    public Chocolate(String name, int weight, double price, boolean nutsInside) {
        super(name, weight, price);
        this.nutsInside = nutsInside;
    }

    public boolean isNutsInside() {
        return nutsInside;
    }

    public void setNutsInside(boolean nutsInside) {
        this.nutsInside = nutsInside;
    }

    @Override
    public String toString() {
        return "Chocolate: " + super.toString() + ", has nuts: " + nutsInside;
    }
}
