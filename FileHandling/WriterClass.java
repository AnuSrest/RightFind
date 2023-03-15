package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterClass {
        public static void main (String args[]) throws IOException {
            BufferedWriter output = new BufferedWriter(new FileWriter(new File(
                    "Books.txt"), true));

            String name;
            int choice;
            try {
                do {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter Author_First name, Author_last name, and Book_name ");
                    name = input.nextLine();
                    output.write(name);
                    output.newLine();
                    System.out.println("Would you like to add another data?");
                    System.out.println("Type 1 for Yes and 2 for No");
                    choice = input.nextInt();
                } while (choice == 1);
                output.close();
            } catch (Exception e) {
                System.out.println("Message: " + e);
            }

    }
}
