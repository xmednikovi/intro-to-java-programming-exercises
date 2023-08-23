package chapter02;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args){
        final int CONSTANT = 4184;

        System.out.print("Please enter the weight of water in kg: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.print("Please enter initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Please enter final temperature");
        double finalTemperature = input.nextDouble();

        double energyNeeded = weight * (finalTemperature - initialTemperature) * CONSTANT;

        System.out.println("The energy needed is: " + energyNeeded);
    }
}
