package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entities.Events;

public class CreateEventController {
    public static void createEvent() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Events> events = new ArrayList<Events>();

        System.out.println("========= Create Event =========");

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Addres: ");
        String addres = scanner.nextLine();

        System.out.println("Category: ");
        String category = scanner.nextLine();

        System.out.println("Description: ");
        String description = scanner.nextLine();

        System.out.println("Hour: ");
        String hour = scanner.nextLine();

        Events e = new Events();
        
        e.setId();
        e.setName(name);
        e.setAddres(addres);
        e.setCategory(category);
        e.setHour(hour);
        e.setDescription(description);

        events.add(e);
    }
}
