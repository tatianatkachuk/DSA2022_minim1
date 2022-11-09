import java.util.*;
public class User {

    private String name;
    private String surname;
    private String idUser;

    private List<Order> ordersUser = new ArrayList<>();   //array o linked ??


    // Constructor
    public User(String idUser, String name, String surname) {
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
    }

    public String getUserId(){
        return idUser;
    }
    public void setUserId(String id){
        this.idUser=id;
    }


    public List<Order> getOrdersUser() {
        return ordersUser;
    }

    public void setPOrdersUser(List<Order> ordersUser) {
        this.ordersUser = ordersUser;
    }

}
