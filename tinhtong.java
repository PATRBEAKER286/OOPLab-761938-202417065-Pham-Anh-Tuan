
import java.util.Scanner;
public class tinhtong{
    public static void main(String[] argrs)
    {
        System.out.println("Chao mung den voi ctrinh tinh tong");
        Scanner scanner=new Scanner(System.in);
        System.out.print("vui long nhap so thu nhat:");
        int sothunhat=scanner.nextInt(); 
        System.out.print("vui long nhap so thu hai:");
        int sothuhai=scanner.nextInt();
        int tong=sothunhat+sothuhai;
        System.out.println("Tong cua "+ sothunhat+" va "+ sothuhai+" la: "+tong);
    }
}
