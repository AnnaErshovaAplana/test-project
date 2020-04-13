
public abstract class Present {
    private String name;
    private int weight;
    private double price;

    //конструктор, который ничего не принимает
    public Present () {}

    public Present(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param products обьекты класса Present
     */
    public static void presentInfo(Present ... products) {
        for (Present product : products) {
            System.out.println(product.toString());
        }
    }

    /**
     * @param products обьекты класса Present
     * @return общую стоимость предметов в подарке (стоимость price в обьектах класса Present)
     */
    public static double presentPrice(Present ... products) {
        double sum = 0;
        for (Present product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    /**
     * @param products обьекты класса Present
     * @return общий вес предметов в подарке (вес weight в обьектах класса Present)
     */
    public static int presentWeight(Present ... products) {
        int weightTotal = 0;
        for (Present product : products) {
            weightTotal += product.getWeight();
        }
        return weightTotal;
    }

    @Override
    public String toString() {
        return "name = " + name + ", weight = " + weight + ", price = " + price;
    }
}