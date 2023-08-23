package chapter08;

import java.util.Scanner;

public class FindNearestPoints {

    public static double computeDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of points: ");
        int numberOfPoints = scanner.nextInt();

        double[][] points = new double[numberOfPoints][2];

        System.out.printf("Enter %d points: ", numberOfPoints);

        for (int i = 0; i < numberOfPoints; i++){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points[i][0] = x;
            points[i][1] = y;
        }

        int pos1 = 0;
        int pos2 = 1;

        double shortestDistance = computeDistance(points[pos1][0], points[pos1][1], points[pos2][0], points[pos2][1]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j ++) {
                double x1 = points[i][0];
                double y1 = points[i][1];
                double x2 = points[j][0];
                double y2 = points[j][1];

                double distance = computeDistance(x1, y1, x2, y2);
                if (distance < shortestDistance) {
                    pos1 = i;
                    pos2 = j;
                    shortestDistance = distance;
                }
            }
        }

        System.out.printf("The closest point is (%3.1f, %3.1f) and (%3.1f, %3.1f)\n",
                points[pos1][0], points[pos1][1], points[pos2][0], points[pos2][1]);
    }
}
