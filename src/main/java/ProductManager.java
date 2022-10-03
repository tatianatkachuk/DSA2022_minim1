import java.util.*;

public interface ProductManager {

    public int numUsers();
    public int numProducts();

    public int numOrders();

    public int numSales(String b001);


    // USERS
    public void addUser(String userId, String name, String surname);



    // PRODUCTS
    public void addProduct(String productId, String name, double price);

    public Product getProduct(String productId);

    List<Product> productsByPrice();

    List<Product> productsBySales();




    // ORDERS
    public void addOrder(Order order);

    public List<Order> ordersByUser(String userId);

    public Order processOrder();



}
