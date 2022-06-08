package com.springboot;

public class UserService {
    public void registerUser(String name) {
        new DatabaseConnection("localhost","kamil",
        "kamil")
//        validate(name)
        DatabaseConnection databaseConnection;
        databaseConnection.addUserToDatabase(name);
    }
}
