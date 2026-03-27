
import java.util.InputMismatchException;
import java.util.Scanner;


public class tinhtongantoan{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.print("nhap so dau tien: ");
            int a=scanner.nextInt();
            System.out.print("nhap so thu hai: ");
            int b=scanner.nextInt();
            int tong=a+b;
            System.out.println("tong la: "+tong);
        } catch (InputMismatchException e) {
            // bat loi neu so nhap vao khong dung 
            System.out.print("nhap sai dinh dang");
        } finally {
           // ket thuc chuong trinh du nhap dung hay sai
           scanner.close();
           System.out.print("ket thuc chuong trinh");
        }
    }
}