import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {
        public static String readFileAsString(String filename) throws IOException {
            return new String(Files.readAllBytes(Paths.get(filename)));
        }
        public static void main(String[] args) throws IOException {

            String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\Downloads\\dataset.txt")));
            int a = 0;

            String[] massive = string.split("\\s\\W");
            for (int i = 0; i < massive.length; i++) {
                if (Integer.parseInt(massive[i]) == 0) {
                    System.out.println(a);
                    break;
                }
                else if (Integer.parseInt(massive[i]) % 2 == 0){
                    a++;
                }
            }

        }
}

