package model;

import java.util.Map;

public class Store {


    private String name;
    private String address;
    private Map<String, Integer> products;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Store store = (Store) o;

        if (name != null ? !name.equals(store.name) : store.name != null) return false;
        if (address != null ? !address.equals(store.address) : store.address != null) return false;
        return products != null ? products.equals(store.products) : store.products == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\n\tStore " +
                "name='" + name +
                ", address='" + address +
                ", products=" + products;
    }

    public void buildProductList() {

    }
}
