package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println( parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        List<String> people = new ArrayList<>();
        File file = new File("src/day14/People.txt");
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                 String line = scanner.nextLine();
                 String[] person =  line.split(" ");
                 if(Integer.parseInt(person[1])<0){
                    throw new IllegalArgumentException();
                 }
                 people.add(line);

            }

           return people;


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect input file");
        }
        return null;
    }
}
