package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entities.Events;

public class CreateEventController {
    public static void createEvent() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Events> events = new ArrayList<Events>();

        System.out.println("========= Create Event =========");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Addres: ");
        String addres = scanner.nextLine();

        System.out.print("Category: ");
        String category = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Hour: ");
        String hour = scanner.nextLine();

        Events e = new Events();

        try {
            SimpleDateFormat formatingToDateType = new SimpleDateFormat("HH:mm");
            Date hourFormat = formatingToDateType.parse(hour);

            e.setHour(hourFormat);
        } catch (ParseException error) {
            System.out.println("Error parsing hour: " + error.getMessage());
        }

        e.setId();
        e.setName(name);
        e.setAddres(addres);
        e.setCategory(category);
        e.setDescription(description);

        events.add(e);

        System.out.println(e);
    }
}
