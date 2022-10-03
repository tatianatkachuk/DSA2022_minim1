import java.util.*;

public class Order {

    private List<String> products = new ArrayList<>();

    public Order(String idOrder) {
    }

    public void addLP(int quantity, String idProduct) {
        for (int i = 0; i < quantity; i++) {
            this.products.add(idProduct);
        }

    }

    public Object getLP(int i) {
        return null;
    }

    public int getQuantity() {
        return products.size();
    }
}
