package controller;

import java.util.ArrayList;
import java.util.Scanner;

import entities.User;

public class CreateUserController {
    public static void createUser() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();

        System.out.println("========= Create User =========");

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Addres: ");
        String addres = scanner.nextLine();

        System.out.print("Age: ");
        Number age = scanner.nextInt();

        User u = new User();

        u.setId();
        u.setEmail(email);
        u.setName(name);
        u.setAge(age);
        u.setAddres(addres);

        users.add(u);

        for (User user : users) {
            System.out.println("Olá " + user.getName() + " Seja bem ao sistema!");
        }
    }
}
