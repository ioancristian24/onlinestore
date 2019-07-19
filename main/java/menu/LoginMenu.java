package menu;

import model.User;
import service.LoginService;

import java.util.Scanner;
import java.util.logging.Logger;

public class LoginMenu extends AbstractMenu {

    private final static Logger logger = Logger.getLogger(Logger.class.getName());

    @Override
    protected void displayOptions() {
        System.out.println(" LOGIN MENU ");
        System.out.println("1 - LOGIN ");
        System.out.println("2 - DISPLAY AVAILABLE PRODUCTS ");
        System.out.println("3 - DISPLAY SHOPPING CART ");
        System.out.println("4 - BUY PRODUCT ");
        System.out.println("0 - EXIT");
    }

    @Override
    protected void executeOption(Integer option) {
        switch (option) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce your user: ");
                String userId = scanner.nextLine();
                System.out.println("Introduce your password: ");
                String password = scanner.nextLine();
                System.out.println(userId + " " + password);
                LoginService loginService = new LoginService();
                User user = loginService.login(userId, password);
                if (user != null) {
                    logger.info("Welcome, " + userId);
                    BuyMenu buyMenu = new BuyMenu(user);
                    buyMenu.displayMenu();
                } else {
                    logger.warning("Invalid username/password! ");
                }
                break;
            case 0:
                logger.info("Exiting... ");
                break;
            default:
                logger.warning("Invalid option! ");
                break;
        }
    }
}
