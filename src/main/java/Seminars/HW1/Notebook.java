package Seminars.HW1;

public class Notebook implements Comparable<Notebook>{

    Main.manufacturer manufacturer;
    double price;
    int ram;

    public Notebook(Main.manufacturer manufacturer, double price, int ram) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "price = " + price +
                " ram = " + ram +
                " manufacturer = " + manufacturer;
    }

    @Override
    public int compareTo(Notebook o) {
        if (this.price == o.price) {
            if (this.ram == o.ram) {
                return Integer.compare(this.manufacturer.ordinal(),o.manufacturer.ordinal());
            }
            return Integer.compare(this.ram, o.ram);
        }
        return Double.compare(this.price, o.price);
    }
}
