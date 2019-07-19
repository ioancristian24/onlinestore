package menu;

import model.User;
import service.BuyService;

import java.util.logging.Logger;

public class BuyMenu extends AbstractMenu {

    private static final Logger logger = Logger.getLogger(Logger.class.getName());
    private User user;

    public BuyMenu(User user) {
        this.user = user;
    }

    protected void displayOptions() {
        System.out.println(" PRODUCTS MENU ");
        System.out.println("1 - DISPLAY AVAILABLE PRODUCTS ");
        System.out.println("3 - DISPLAY SHOPPING CART ");
        System.out.println("4 - BUY PRODUCT ");
        System.out.println("0 - LOGOUT ");

    }

    protected void executeOption(Integer option) {
        BuyService buyService = new BuyService(user);
            switch (option){
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:
            }
    }

}
