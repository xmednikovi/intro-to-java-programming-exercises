package chapter17;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Exercise06 {

    public static void main(String[] args) {
        // create an array of Loan objects
        Loan[] loansArr = new Loan[5];
        Random random = new Random();
        for (int i =0; i < 5; i++) {
            int numberOfYears = random.nextInt(1, 10);
            double annualRate = random.nextDouble(1.5, 5.5);
            double amount = random.nextDouble(1000, 5000);
            loansArr[i] = new Loan(annualRate, numberOfYears, amount);
        }

        // store data in file
        try (FileOutputStream fileOutputStream = new FileOutputStream("Exercise17_06.dat");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            ){
            for (int i = 0; i < loansArr.length; i++) {
                Loan loan = loansArr[i];
                objectOutputStream.writeObject(loan);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
