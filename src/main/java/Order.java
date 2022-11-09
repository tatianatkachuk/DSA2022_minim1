import java.util.*;

public class Order {
    private int c;
    private List<String> prods = new ArrayList<>();

    private HashMap<String, Integer> hashOrder = new HashMap<>();

    public Order(String idOrder) {
    }

    public int getQuantity(Order o) {
        List<String> namesprods = o.getProducts();
        for (String name : namesprods) {
            this.c = hashOrder.size();
        }
        return c;
    }

    public List<String> getProducts() {
        return prods;
    }

    public void addProduct(int quant, String prod){

        String product = prod.toLowerCase();

        this.hashOrder.put(product,quant);
        this.prods.add(prod);

    }
}
