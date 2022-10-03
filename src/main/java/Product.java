public class Product {

    private String name;
    private String productId;
    private int numSales;
    private double price;

    // Constructor
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.numSales = 0;
        this.price = price;
    }


    public Double getPrice() {
        return price;
    }



    public String getProductId() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public int getNumSales() {
        return numSales;
    }
}
