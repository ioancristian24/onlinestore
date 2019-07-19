import menu.LoginMenu;
import model.Store;

public class Main {

    public static void main(String[] args) {

        Store store = new Store("My Store","My Address");

        store.buildProductList();

        LoginMenu loginMenu = new LoginMenu();
        loginMenu.displayMenu();
    }
}
