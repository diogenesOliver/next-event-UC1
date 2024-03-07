package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;

public class GetEventsController {

    public static void getEvents() {
        Path directory = Paths.get("C:/Users/dioge/OneDrive/Área de Trabalho/next-event-UC1/events.txt");

        try {
            byte[] text = Files.readAllBytes(directory);
            String reading = new String(text);

            System.out.println(reading);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
