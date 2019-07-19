package service;

import model.User;
import utils.ApplicationConst;
import utils.TxtFileReader;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class BuyService {

    private User user;
    private final static Logger logger = Logger.getLogger(Logger.class.getName());

    public BuyService(User user) {
        this.user = user;
    }

    public void buildProductList() {
        TxtFileReader txtFileReader = new TxtFileReader(ApplicationConst.PRODUCTS_FILE_PATH);
        ArrayList<String> lines = txtFileReader.read();
        for (String line : lines) {
            String[] tokens = line.split(" ");
            if (tokens.length != 3) {
                continue;
            }

        }
    }

    public void displayCurrentInfo() {
        logger.info(user.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPress any key...");
        scanner.nextLine();
    }
}
