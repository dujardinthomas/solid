package org.example.tp.s;

public class UserMain {

    public static void main(String[] args) {
        User user = new User("john_doe", "Password123");
        LoginUser loginUser = new LoginUser();
        loginUser.loginUser(user);
    }
}
