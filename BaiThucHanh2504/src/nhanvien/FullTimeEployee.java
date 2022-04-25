package nhanvien;
import java.util.Scanner;

public class FullTimeEployee extends Employee{
    public String dilam;
    public void nhap() {
        System.out.println("nhap ten phuong tien di lam: ");
        Scanner scanner = new Scanner(System.in);
        dilam = scanner.nextLine();
    }
}
