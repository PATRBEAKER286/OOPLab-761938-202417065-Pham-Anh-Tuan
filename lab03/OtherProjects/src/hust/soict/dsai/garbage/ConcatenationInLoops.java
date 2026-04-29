package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);
        
        // Thí nghiệm 1: Sử dụng toán tử "+" để nối chuỗi (Cách "gà mờ")
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2);
        }
        System.out.println("Thời gian nối chuỗi bằng dấu + : " + (System.currentTimeMillis() - start) + " ms");
        
        // Thí nghiệm 2: Sử dụng StringBuilder (Cách chuyên nghiệp)
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        System.out.println("Thời gian nối chuỗi bằng StringBuilder: " + (System.currentTimeMillis() - start) + " ms");
    }
}