import java.util.*;

public class ProductManagerImpl implements ProductManager{

    private List<Product> productsList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();

    private List<User> userList = new ArrayList<>();

    // private HashMap<Integer, User> users = new HashMap<>();

    //////////////////////////////////////////////////////////////////////////////////
    // USERS
    //////////////////////////////////////////////////////////////////////////////////

    @Override
    public int numUsers() {
        return userList.size();
    }

    @Override
    public void addUser(String userId, String name, String surname) {
        User u = new User(userId, name, surname);
        userList.add(u);
    }



    //////////////////////////////////////////////////////////////////////////////////
    // PRODUCTS
    //////////////////////////////////////////////////////////////////////////////////

    @Override
    public int numProducts() {
        return productsList.size();
    }

    @Override
    public void addProduct(String productId, String name, double price) {
        Product p = new Product(productId, name, price);
        productsList.add(p);

    }

    @Override
    public Product getProduct(String productId) {
        return null;
    }

    @Override
    public List<Product> productsByPrice() {
        List<Product> list = new ArrayList<>(this.productsList);
        return list;
    }

    @Override
    public List<Product> productsBySales() {
        List<Product> list = new ArrayList<>(this.productsList);
        return list;
    }





    //////////////////////////////////////////////////////////////////////////////////
    // ORDERS
    //////////////////////////////////////////////////////////////////////////////////

    @Override
    public int numOrders() {
        return orderList.size();
    }

    @Override
    public int numSales(String b001) {
        return 0;
    }


    @Override
    public void addOrder(Order order) {
        orderList.add(order);
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        return null;
    }

    @Override
    public Order processOrder() {
        return null;
    }


}
