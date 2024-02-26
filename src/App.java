import controller.CreateUserController;
import controller.CreateEventController;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CreateUserController creatUserControler = new CreateUserController();
        creatUserControler.createUser();
    }
}