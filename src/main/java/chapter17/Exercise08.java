package chapter17;

import java.io.*;

public class Exercise08 {

    public static int readCount () {
        try (FileInputStream fileInputStream = new FileInputStream("Exercise17_08.dat");
             DataInputStream dataInputStream = new DataInputStream(fileInputStream)) {
            int value = dataInputStream.readInt();
            return value;
        } catch (IOException e) {
            System.out.println("File not found...");
            return 0;
        }
    }

    public static void writeCount (int i) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("Exercise17_08.dat");
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)
        ) {
            dataOutputStream.writeInt(i);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        int count = readCount();
        System.out.println("Program was executed " + count + " times");
        count += 1;
        writeCount(count);
    }
}
