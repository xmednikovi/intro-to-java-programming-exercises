package chapter20;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise18 {

    public static long getSize (File directory){
        long size = 0;
        Queue<File> queue = new LinkedList<>();
        queue.offer(directory);

        while ( !queue.isEmpty() ){
            File temp = queue.remove();
            if (temp.isFile()) {
                size += temp.length();
            } else {
                File[] files = temp.listFiles();
                if (files == null || files.length == 0) {
                    continue;
                }

                for (File file: files){
                    queue.offer(file);
                }
            }
        }

        return size;
    }

    public static void main(String[] args) {
        // get name of directory
        if (args.length != 1){
            System.out.println("Invalid arguments");
            System.exit(1);
        }
        String fileName = args[0];
        File file = new File(fileName);
        if (! file.exists()) {
            System.out.println("The directory does not exist");
            System.exit(1);
        }
        if (file.isFile()) {
            System.out.println("Not a directory");
            System.exit(1);
        }

        long size = getSize(file);
        System.out.println("The size of directory is " + size + " bytes");
    }
}
