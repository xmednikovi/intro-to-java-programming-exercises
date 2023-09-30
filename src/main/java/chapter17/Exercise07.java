package chapter17;

import java.io.*;
import java.util.ArrayList;

public class Exercise07 {

    public static void main(String[] args) {
        ArrayList<Loan> loans = new ArrayList<>();

        // read data from file
        try (FileInputStream fileInputStream = new FileInputStream("Exercise17_06.dat")) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {


                Loan loan = (Loan) objectInputStream.readObject();
                while (loan != null) {
                    loans.add(loan);
                    loan = (Loan) objectInputStream.readObject();
                }


            } catch (EOFException e) {
                // sum all amounts
                double sum = loans.stream().mapToDouble(Loan::getLoadAmount).sum();
                System.out.println("Sum of all amounts is " + sum);

            } catch (ClassNotFoundException e) {
                System.out.println("Invalid input!");
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
