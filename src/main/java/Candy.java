public class Candy extends Present {
    private String color;

    //конструктор, который ничего не принимает
    public Candy() {}

    public Candy(String name, int weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Candy: " + super.toString() + ", color: " + color;
    }
}
