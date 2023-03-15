package FileHandling;

import java.io.*;
import java.util.Scanner;

public class ReaderClass {
    public static void main(String[] args)throws IOException {
        String name;
        String strLine;
        try {
            FileInputStream fstream = new FileInputStream("Books.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a Author's name");
            name = input.nextLine();

            String[] line;
            String part1, part2, part3;

            while ((strLine = br.readLine()) != null) {
                line = strLine.split(" ");
                part1 = line[0];
                part2 = line[1];
                part3 = line[2];

                if (name.equals(part1)) {
                    System.out.println( part1 + " " + part2 + " " + part3);
                }


            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}


