package service;

import model.User;
import utils.ApplicationConst;
import utils.TxtFileReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LoginService {

    public User login(String name, String password){
        User user = null;
        TxtFileReader txtFileReader = new TxtFileReader(ApplicationConst.USERS_FILE_PATH);
        ArrayList<String> lines = txtFileReader.read();
        for (String line : lines){
            String[] tokens = line.split(" ");
            if (tokens.length != 2){
                continue;
            }
            String fileUserId = tokens[0];
            String filePassword = tokens[1];
            if (name.equals(fileUserId) && password.equals(filePassword)){
                Map<String, Integer> products = new HashMap<String, Integer>();
                user = new User(name, password, products);
                break;
            }
        }

        return user;
    }
}
