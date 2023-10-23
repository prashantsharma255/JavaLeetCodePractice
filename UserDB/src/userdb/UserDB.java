/*
 * Copyright 2020 @Prash
 */
package userdb;

import java.util.HashSet;
import java.util.Set;

public class UserDB {
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;
    
    public UserDB(String customUserName, String customPassword, int customAge, Set<Integer> orderIDs){
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Set a = new HashSet<>();
        a.add(1212);
        UserDB Prash = new UserDB("coder","hello world",15,a);
    }
}
