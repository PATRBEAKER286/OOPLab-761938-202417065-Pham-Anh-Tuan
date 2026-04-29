package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.txt"; // Tên file hoặc đường dẫn tới file
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b; // Gây ra cực kỳ nhiều rác
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian đọc file bằng dấu +: " + (endTime - startTime) + " ms");
    }
}