package model;

import java.util.Iterator;
import java.util.Map;

public class User {

    private String name;
    private String password;
    private Map<String, Integer> products;

    public User(String name, String password, Map<String, Integer> products) {
        this.name = name;
        this.password = password;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nUser: " + name + "\nProducts:\n");
        if (products == null || products.isEmpty()) {
            stringBuilder.append("\tThere is no product for user: " + name);
        } else {
            Iterator<Map.Entry<String, Integer>>itr = products.entrySet().iterator();
            while (itr.hasNext()){
                Map.Entry<String, Integer> entry = itr.next();
                stringBuilder.append(entry.getValue());
            }
        }

        return stringBuilder.toString();
    }
}
