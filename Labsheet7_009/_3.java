class PurchaseProduct {
    private String name;
    private double unitPrice;

    public PurchaseProduct(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public PurchaseProduct() {
        this.name = "no product";
        this.unitPrice = 0.0;
    }

    public double getPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Unit Price: $" + unitPrice;
    }
}

class WeighedProduct extends PurchaseProduct {
    private double weight;

    public WeighedProduct(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weight: " + weight + " kg, Total Price: $" + getPrice();
    }
}

class CountedProduct extends PurchaseProduct {
    private int quantity;

    public CountedProduct(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Quantity: " + quantity + ", Total Price: $" + getPrice();
    }
}

public class _3{
    public static void main(String[] args) {
        PurchaseProduct product1 = new WeighedProduct("Apples", 1.5, 2.5);
        PurchaseProduct product2 = new CountedProduct("Pens", 0.8, 5);

        System.out.println(product1);
        System.out.println(product2);
    }
}

