package chapter07;

public class Exercise23 {

    public static void main(String[] args) {
        // create an array
        boolean[] lockers = new boolean[100];
        for (int i = 0; i < 100; i ++){
            lockers[i] = false;
        }

        // start game

        int numberOfStudents = 100;
        for (int i = 1; i < numberOfStudents; i++) {
            // get student
//            int currentStudent  = i;
            // traverse all lockers
            for (int y = i - 1; y < 100; y ++){
                if (y % i == 0) {
                    // swap locker
                    lockers[y] = !lockers[y];
                }
            }
        }

        // print lockers
        for (int i = 0; i < 100; i ++){
            if (lockers[i] == true) {
                // print number
                int lockerNumber = i + 1;
                System.out.print(lockerNumber + " ");
            }
        }
    }
}
