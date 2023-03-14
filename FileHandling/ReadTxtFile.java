package FileHandling;
import java.io.*;
import java.io.IOException;
public class ReadTxtFile {
    public static void main(String args[]) throws IOException {
        //first
        try {
        FileReader fileName=new FileReader("Book.txt");
        BufferedReader readBR=new BufferedReader(fileName);
        String line;
            String author = "Mark Manson";
            String author_1 = " Abbie Headon";
            while ((line = readBR.readLine()) != null) {
                /**if (line.indexOf(author) != -1) {
                    System.out.println(line);
                }
                if (line.indexOf(author_1) != -1) {
                    System.out.println(line);
                }*/
                if (line.contains(author) || line.contains(author_1)) {
                    System.out.println(line);
                }

            }
        readBR.close();
        fileName.close();
        } catch (IOException e) {
        e.printStackTrace();
        }
        //last
    }
}

