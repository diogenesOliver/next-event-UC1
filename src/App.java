import java.util.Scanner;

import entities.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================== New User ==================");
        
        System.out.print("Email:");
        String email = scanner.nextLine();

        System.out.print("Name:");
        String name = scanner.nextLine();

        User u = new User();
        
        u.setEmail(email);
        u.setName(name);
        

        System.out.println("================== New User 2 ==================");
        
        System.out.print("Email:");
        email = scanner.nextLine();

        System.out.print("Name:");
        name = scanner.nextLine();
        
        User u2 = new User();
        u2.setEmail(email);
        u2.setName(name);

        System.out.println("O email cadastrado foi: " + u.getEmail());
        System.out.println("O nome cadastrado foi: " + u.getName());

        System.out.println("O email cadastrado para u2 foi: " + u2.getEmail());
        System.out.println("O nome cadastrado para u2 foi: " + u2.getName());
    }
}
