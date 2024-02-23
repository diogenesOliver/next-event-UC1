import java.util.Scanner;

import entities.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================== New User ==================");

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
        
        System.out.println("UserID: " + u.getId());
        System.out.println("Email: " + u.getEmail());
        System.out.println("Name: " + u.getName());
        System.out.println("Age: " + u.getAge());
        System.out.println("Address: " + u.getAddres());
    }
}
