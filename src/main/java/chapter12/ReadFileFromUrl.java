package chapter12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromUrl {

    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        Scanner scanner = new Scanner(System.in);
        String urlString = scanner.next();
        try {
            URL url = new URL(urlString);
            int count = 0;
            Scanner scanner2 = new Scanner(url.openStream());
            while (scanner2.hasNext()) {
                String line = scanner2.nextLine();
                count += line.length();
            }

            System.out.println("File size is " + count + " characters");
        } catch( MalformedURLException ex){
            System.out.println("Invalid url");
        } catch (IOException ex){
            System.out.println("No such file");
        }
    }
}
